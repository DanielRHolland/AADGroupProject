package com.eksi.storeapi;

import com.eksi.storeapi.bl.ProductsBl;
import com.eksi.storeapi.bl.CustomersBl;
import com.eksi.storeapi.bl.TransactionBl;
import com.eksi.storeapi.blimpl.ProductsBlImpl;
import com.eksi.storeapi.blimpl.CustomersBlImpl;
import com.eksi.storeapi.blimpl.TransactionBlImpl;

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
