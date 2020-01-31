package com.eksi.storeapi.Transactions;

import com.eksi.storeapi.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@RestController
public class TransactionController {

    private TransactionService sl = ApplicationContext.transactionService();

    @RequestMapping(value = "/transaction/save", method = RequestMethod.POST)
    public String saveTransaction(@RequestBody Transaction transaction) throws IOException {
        sl.update(transaction);
        return "transaction/success";
    }

    @RequestMapping(value = "/transaction/getLog/{dateFrom}/{currentDate}", method = RequestMethod.GET)
    public List<Transaction> getTransactionLog(@PathVariable("dateFrom") long dateFrom, @PathVariable("currentDate") long currentDate){
        return sl.getTransactionLog(dateFrom, currentDate);

    }

}