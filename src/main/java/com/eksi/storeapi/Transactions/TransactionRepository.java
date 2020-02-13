package com.eksi.storeapi.Transactions;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransactionRepository extends CrudRepository<Transaction, String> {
    void deleteById(String id);
    List<Transaction> findTransactionBynNumber(String nNumber);
}
