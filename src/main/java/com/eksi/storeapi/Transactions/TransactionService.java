package com.eksi.storeapi.Transactions;

import java.io.IOException;

public interface TransactionService {
    public Transaction update(Transaction transaction) throws IOException;
}
