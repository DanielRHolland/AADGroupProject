package com.eksi.storeapi.Entries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class EntriesServiceImpl implements EntriesService {
    @Autowired
    private EntriesRepository er;

    @Override
    public List<Entries> update(List<Entries> entries) throws IOException {
        deleteEntriesWithSameTransactionId(entries, entries.get(0).getTransactionId());
        for(Entries entry : entries){
            er.save(entry);
        }
        return entries;
    }

    @Override
    public List<Entries> getEntriesFromTransactionId(String id) {
        return er.getEntriesByTransactionId(id);
    }

    public void deleteEntriesWithSameTransactionId(List<Entries> entries, String transactionId){
        for(Entries entry : entries){
            if(entry.getTransactionId().equalsIgnoreCase(transactionId)){
                er.delete(entry);
            }
        }
    }


}
