package com.eksi.storeapi.Products;


public interface ProductsBl {
    int getQuantity(final String id);
    Product getProduct(final String id);
}
