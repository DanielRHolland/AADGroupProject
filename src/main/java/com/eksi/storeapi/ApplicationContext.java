package com.eksi.storeapi;

import com.eksi.storeapi.Products.ProductsService;
import com.eksi.storeapi.Customers.CustomersService;
import com.eksi.storeapi.Transactions.TransactionService;
import com.eksi.storeapi.Products.ProductsServiceImpl;
import com.eksi.storeapi.Customers.CustomersServiceImpl;
import com.eksi.storeapi.Transactions.TransactionServiceImpl;

public class ApplicationContext {
    static public ProductsService productsBl() {
        return new ProductsServiceImpl();
    }
    
    static public CustomersService customersBl() {
        return new CustomersServiceImpl();
    }
    
    static public TransactionService transactionBl() {
        return new TransactionServiceImpl();
    }
}
