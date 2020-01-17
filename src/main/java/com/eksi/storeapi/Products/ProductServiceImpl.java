package com.eksi.storeapi.Products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository pr;

    @Override
    public Product update(Product p) throws IOException {
        return pr.save(p);
    }


    public Product getProduct(Integer id){
        return pr.findById(id).orElse(null);
    }
}
