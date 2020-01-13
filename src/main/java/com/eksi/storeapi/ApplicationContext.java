package com.eksi.storeapi;

import com.eksi.storeapi.Products.ProductsBl;
import com.eksi.storeapi.Customers.CustomersBl;
import com.eksi.storeapi.Transactions.TransactionBl;
import com.eksi.storeapi.Products.ProductsBlImpl;
import com.eksi.storeapi.Customers.CustomersBlImpl;
import com.eksi.storeapi.Transactions.TransactionBlImpl;

public class ApplicationContext {
    static public ProductsBl productsBl() {
        return new ProductsBlImpl();
    }
    
    static public CustomersBl customersBl() {
        return new CustomersBlImpl();
    }
    
    static public TransactionBl transactionBl() {
        return new TransactionBlImpl();
    }
}
