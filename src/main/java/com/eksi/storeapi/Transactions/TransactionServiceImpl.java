package com.eksi.storeapi.Transactions;

import com.eksi.storeapi.Entries.Entries;
import com.eksi.storeapi.Entries.EntriesRepository;
import com.eksi.storeapi.Products.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository tr;

    @Autowired
    private EntriesRepository er;

    @Override
    public Transaction update(Transaction transaction) throws IOException{
        return tr.save(transaction);
    }

    @Override
    public void deleteById(String id) throws IOException{
        tr.deleteById(id);
    }

    @Override
    public Transaction getTransaction(String id){
        return tr.findById(id).orElse(null);
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
