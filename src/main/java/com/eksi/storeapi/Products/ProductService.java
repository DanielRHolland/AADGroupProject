package com.eksi.storeapi.Products;


import java.io.IOException;

public interface ProductService {

    Product update(Product p) throws IOException;

    Product getProduct(Integer id);
}
