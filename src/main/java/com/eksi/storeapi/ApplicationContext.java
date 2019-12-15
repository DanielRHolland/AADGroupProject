package com.eksi.storeapi;

import com.eksi.storeapi.bl.ProductsBl;
import com.eksi.storeapi.bl.CustomersBl;
import com.eksi.storeapi.blimpl.ProductsBlImpl;
import com.eksi.storeapi.blimpl.CustomersBlImpl;

public class ApplicationContext {
    static public ProductsBl productsBl() {
        return new ProductsBlImpl();
    }
    
    static public CustomersBl customersBl() {
        return new CustomersBlImpl();
    }
}
