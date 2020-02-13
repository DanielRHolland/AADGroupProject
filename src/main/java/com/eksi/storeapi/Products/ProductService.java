package com.eksi.storeapi.Products;

import java.io.IOException;
import java.util.List;

public interface ProductService {
    Product update(Product p) throws IOException;
    List getAllProducts();
    Product getProduct(String id);
    void deleteById(String id) throws IOException;
    String updateProductQuantity(String productId, int quantity);
}
