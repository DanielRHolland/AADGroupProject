package com.eksi.storeapi.Products;


public interface ProductsService {
    int getQuantity(final String id);
    Product getProduct(final String id);
}
