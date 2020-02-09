package com.eksi.storeapi.Transactions;

import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, String> {
    void deleteTransactionByTransactionId(String id);
}
