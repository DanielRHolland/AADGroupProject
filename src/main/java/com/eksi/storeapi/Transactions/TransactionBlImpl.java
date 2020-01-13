package com.eksi.storeapi.Transactions;

import java.util.Arrays;

public class TransactionBlImpl implements TransactionBl {
    @Override
    public Transaction getTransaction(String transactionId){
        Transaction transaction = new Transaction(transactionId);
        transaction.setTransactionEntries(Arrays.asList(new TransactionEntry("entry" + transactionId)));
        return transaction;
    }
}
