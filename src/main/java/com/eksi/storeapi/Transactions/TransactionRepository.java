package com.eksi.storeapi.Transactions;

import com.eksi.storeapi.Customers.Customer;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Customer, Integer> {
}
