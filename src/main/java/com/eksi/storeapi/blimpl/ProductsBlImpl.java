package com.eksi.storeapi.blimpl;

import com.eksi.storeapi.bl.ProductsBl;

public class ProductsBlImpl implements ProductsBl {
    @Override
    public int getQuantity(String id) {
        return 10;
    }
}
