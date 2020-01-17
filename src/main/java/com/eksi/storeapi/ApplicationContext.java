package com.eksi.storeapi;

import com.eksi.storeapi.Authentication.ApiKeyImpl;
import com.eksi.storeapi.Authentication.ApiKeyService;
import com.eksi.storeapi.Products.ProductService;
import com.eksi.storeapi.Staff.StaffService;
import com.eksi.storeapi.Transactions.TransactionService;
import com.eksi.storeapi.Products.ProductServiceImpl;
import com.eksi.storeapi.Staff.StaffServiceImpl;
import com.eksi.storeapi.Transactions.TransactionServiceImpl;

public class ApplicationContext {
    static public ProductService productsService() {
        return new ProductServiceImpl();
    }
    
    static public StaffService customersService() {
        return new StaffServiceImpl();
    }
    
    static public TransactionService transactionService() {
        return new TransactionServiceImpl();
    }

    static public ApiKeyService apiKeyService() { return new ApiKeyImpl(); }
}
