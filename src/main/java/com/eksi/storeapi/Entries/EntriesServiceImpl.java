package com.eksi.storeapi.Entries;

import com.eksi.storeapi.Transactions.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class EntriesServiceImpl implements EntriesService {
    @Autowired
    private EntriesRepository er;

    @Override
    public Entries update(Entries entries) throws IOException {
        return er.save(entries);
    }

}
