package com.eksi.storeapi.Products;

public class ProductsBlImpl implements ProductsBl {
    @Override
    public int getQuantity(String id) {
        return 10;
    }
    @Override
    public Product getProduct(final String id) {
      return new Product(id);
    }
}
