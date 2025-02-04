package com.eksi.storeapi.Transactions;

import com.eksi.storeapi.Entries.Entries;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface TransactionService {
    Transaction update(Transaction transaction) throws IOException;
    List getAllTransaction();
    List<Transaction> getTransactionLog(long dateFrom, long currentDate);
    void deleteById(String id) throws IOException;
    Transaction getTransaction(String id);
    List<Transaction> getTransactionFromNNumber(String nNumber);
    List<Transaction> getUserTransactions(String nNumber);
}
