package com.eksi.storeapi.Transactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository tr;

    @Override
    public Transaction update(Transaction transaction) throws IOException{
        return tr.save(transaction);
    }

    public List getAllTransaction(){
        return (List)tr.findAll();
    }

    public List<Transaction> getTransactionLog(long dateFrom, long currentDate){
        List<Transaction> allTxs = (List<Transaction>) tr.findAll();
        return allTxs.stream()
                .filter(tx -> tx.getTimeStamp() > dateFrom && tx.getTimeStamp() < currentDate)
                .collect(Collectors.toList());
    }
}
