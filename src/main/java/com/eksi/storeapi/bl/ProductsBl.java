package com.eksi.storeapi.bl;


import com.eksi.storeapi.datatypes.ProductInformation;

public interface ProductsBl {
    int getQuantity(final String id);
    ProductInformation getProduct(final String id);
}
