package com.eksi.storeapi.Transactions;

import java.io.IOException;
import java.util.List;

public interface TransactionService {
    public Transaction update(Transaction transaction) throws IOException;
    List getAllTransaction();
    List<Transaction> getTransactionLog(long dateFrom, long currentDate);
    void deleteById(String id) throws IOException;
}
