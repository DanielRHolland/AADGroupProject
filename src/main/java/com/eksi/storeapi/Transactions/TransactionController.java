package com.eksi.storeapi.Transactions;

import com.eksi.storeapi.ApplicationContext;
import com.eksi.storeapi.Entries.Entries;
import com.eksi.storeapi.Entries.EntriesService;
import com.eksi.storeapi.Products.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
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

    @Autowired
    private ProductService pl = ApplicationContext.productsService();


    @PostMapping(value = "/s")
    public Transaction saveTransaction(@RequestBody Transaction transaction) throws IOException {
        sl.update(transaction);
        return transaction;
    }

    @GetMapping(value = "/l/{dateFrom}/{currentDate}")
    public List<Transaction> getTransactionLog(@PathVariable("dateFrom") long dateFrom, @PathVariable("currentDate") long currentDate){
        return sl.getTransactionLog(dateFrom, currentDate);
    }

    @GetMapping(value = "/csv/{from}/{to}")
    @ResponseBody
    public String getTransactionLogAsCSV(@PathVariable("from") long from, @PathVariable("to") long to, HttpServletResponse response) {
        // Set headers (CSV type)
        response.setContentType("text/csv; charset=utf-8"); // Return CSV type
        response.setHeader("Content-disposition", "attachment;filename=transactions.csv"); // Treat as file download

        // Build CSV data
        StringBuilder sb = new StringBuilder();
        sb.append("Transaction ID,Budget Code,nNumber,UNIX Timestamp\n"); // Column names

        // Add data
        for (Transaction tx : getTransactionLog(from, to)) {
            sb.append(tx.getTransactionId());
            sb.append(',');
            sb.append(tx.getBudgetCode());
            sb.append(',');
            sb.append(tx.getnNumber());
            sb.append(',');
            sb.append(tx.getTimeStamp());
            sb.append('\n');
        }

        // Return data
        return sb.toString();
    }

    @DeleteMapping(value = "/d/{id}")
    public String deleteStaff(@PathVariable String id) throws IOException{
        sl.deleteById(id);
        return "transaction/delete/success";
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
            pl.updateProductQuantity(entryVar.getProductId(), entryVar.getQuantity());
        }

        el.update(entry);
        return entry;
    }

}