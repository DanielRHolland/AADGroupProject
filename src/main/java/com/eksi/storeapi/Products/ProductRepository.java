package com.eksi.storeapi.Products;

import com.eksi.storeapi.Customers.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository  extends CrudRepository<Product, Integer> {
}
