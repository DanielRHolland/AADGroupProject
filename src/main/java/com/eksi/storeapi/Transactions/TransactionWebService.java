package com.eksi.storeapi.Transactions;

import com.eksi.storeapi.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("transaction")
public class TransactionWebService {
    @RequestMapping("/")
    public Transaction transaction(@RequestParam(value="transactionId", defaultValue="12345") String transactionid) {
        return ApplicationContext.transactionService().getTransaction(transactionid);
    }
}