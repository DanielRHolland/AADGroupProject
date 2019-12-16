package com.eksi.storeapi.bl;

import com.eksi.storeapi.datatypes.Transaction;

public interface TransactionBl {
    Transaction getTransaction(String transactionId);
}
