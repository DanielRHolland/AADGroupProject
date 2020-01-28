package com.eksi.storeapi.Transactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Arrays;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository tr;

    @Override
    public Transaction update(Transaction transaction) throws IOException{
        return tr.save(transaction);
    }
}
