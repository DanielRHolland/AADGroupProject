package com.eksi.storeapi.Products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsServiceImpl implements ProductsService {
    @Autowired
    private ProductRepository pr;

    @Override
    public int getQuantity(String id) {
        return 10;
    }
    @Override
    public Product getProduct(final String id) {
      return new Product(id);
    }
}
