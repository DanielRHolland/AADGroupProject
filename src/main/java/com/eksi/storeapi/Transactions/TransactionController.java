package com.eksi.storeapi.Transactions;

import com.eksi.storeapi.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/transaction")
public class TransactionController {

    @Autowired
    private TransactionService sl = ApplicationContext.transactionService();

    @PostMapping(value = "/s")
    public String saveTransaction(@RequestBody Transaction transaction) throws IOException {
        sl.update(transaction);
        return "transaction/success";
    }

    @GetMapping(value = "/l/{dateFrom}/{currentDate}")
    public List<Transaction> getTransactionLog(@PathVariable("dateFrom") long dateFrom, @PathVariable("currentDate") long currentDate){
        return sl.getTransactionLog(dateFrom, currentDate);
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

}