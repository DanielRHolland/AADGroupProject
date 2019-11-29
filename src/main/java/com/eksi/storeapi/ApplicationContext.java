package com.eksi.storeapi;

import com.eksi.storeapi.bl.ProductsBl;
import com.eksi.storeapi.blimpl.ProductsBlImpl;

public class ApplicationContext {
    static public ProductsBl productsBl() {
        return new ProductsBlImpl();
    }
}
