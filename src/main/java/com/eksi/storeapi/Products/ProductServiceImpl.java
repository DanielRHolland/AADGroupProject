package com.eksi.storeapi.Products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository pr;

    @Override
    public Product update(Product p) throws IOException {
        return pr.save(p);
    }

    @Override
    public Product getProduct(String id){
        return pr.findById(id).orElse(null);
    }

    @Override
    public List getAllProducts(){
        return (List)pr.findAll();
    }

    @Override
    public void deleteById(String id) throws IOException{
        pr.deleteProductById(id);
    }

}
