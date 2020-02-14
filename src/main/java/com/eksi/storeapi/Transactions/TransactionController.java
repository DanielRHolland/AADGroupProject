package com.eksi.storeapi.Transactions;

import com.eksi.storeapi.ApplicationContext;
import com.eksi.storeapi.Entries.Entries;
import com.eksi.storeapi.Entries.EntriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/transaction")
public class TransactionController {

    @Autowired
    private TransactionService sl = ApplicationContext.transactionService();

    @Autowired
    private EntriesService el = ApplicationContext.entriesService();

    @PostMapping(value = "/s")
    public Transaction saveTransaction(@RequestBody Transaction transaction) throws IOException {
        return sl.update(transaction);
    }

    @GetMapping(value = "/l/{dateFrom}/{currentDate}")
    public List<Transaction> getTransactionLog(@PathVariable("dateFrom") long dateFrom, @PathVariable("currentDate") long currentDate){
        return sl.getTransactionLog(dateFrom, currentDate);
    }

    @GetMapping(value = "/csv/{from}/{to}")
    public ResponseEntity<InputStreamResource> getTransactionLogAsCSV(@PathVariable("from") long from, @PathVariable("to") long to){
        HttpHeaders respHeaders = new HttpHeaders();
        respHeaders.setContentLength(12345678);
        respHeaders.setContentDispositionFormData("attachment", "transactionLog.csv");
        InputStreamResource isr = null;
        try {
            isr = new InputStreamResource(new FileInputStream(sl.getTransactionLogAsCSV(from, to)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<InputStreamResource>(isr, respHeaders, HttpStatus.OK);
    }

    @DeleteMapping(value = "/d/{id}")
    public String deleteStaff(@PathVariable String id) throws IOException{
        sl.deleteById(id);
        return "{ \"status\" : \"transaction/delete/success\"}";
    }

    @GetMapping(value = "/l")
    public List getAllTransactions(){
        return (List) sl.getAllTransaction();
    }

    //Entries
    @GetMapping(value = "/entries/{id}")
    public List<Entries> getEntriesFromTransactionId(@PathVariable String id){
        return el.getEntriesFromTransactionId(id);
    }

    @PostMapping(value = "/entries/s/{transactionId}")
    public List<Entries> saveEntry(@RequestBody List<Entries> entry, @PathVariable String transactionId) throws IOException {
        for(Entries entryVar : entry){
            entryVar.setTransactionId(transactionId);
        }
        el.update(entry, transactionId);
        return entry;
    }

}