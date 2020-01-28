package com.eksi.storeapi.Transactions;

import com.eksi.storeapi.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class TransactionController {

    @Autowired
    private TransactionServiceImpl sl;

    @RequestMapping(value = "/transaction/save", method = RequestMethod.POST)
    public String saveTransaction(@RequestBody Transaction transaction) throws IOException {
        sl.update(transaction);
        return "transaction/success";
    }
}