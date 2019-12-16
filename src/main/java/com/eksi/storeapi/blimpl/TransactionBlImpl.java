package com.eksi.storeapi.blimpl;

import java.util.List;
import java.util.Arrays;

import com.eksi.storeapi.bl.TransactionBl;
import com.eksi.storeapi.datatypes.Transaction;
import com.eksi.storeapi.datatypes.TransactionEntry;

public class TransactionBlImpl implements TransactionBl {
    @Override
    public Transaction getTransaction(String transactionId){
        Transaction transaction = new Transaction(transactionId);
        transaction.setTransactionEntries(Arrays.asList(new TransactionEntry("entry" + transactionId)));
        return transaction;
    }
}
