package com.eksi.storeapi.Transactions;

import com.eksi.storeapi.Entries.Entries;
import com.eksi.storeapi.Entries.EntriesRepository;
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

    public List getAllTransaction(){
        return (List)tr.findAll();
    }

    public List<Transaction> getTransactionLog(long dateFrom, long currentDate){
        List<Transaction> allTxs = (List<Transaction>) tr.findAll();
        return allTxs.stream()
                .filter(tx -> tx.getTimeStamp() > dateFrom && tx.getTimeStamp() < currentDate)
                .collect(Collectors.toList());
    }

    public File getTransactionLogAsCSV(long from, long to){
        File file = new File("transactions.csv");
        try {
            FileWriter fr = new FileWriter(file, true);
            String string = getTransactionLog(from,to).toString();
            fr.write(string);
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
}
