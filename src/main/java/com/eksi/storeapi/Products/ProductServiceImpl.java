package com.eksi.storeapi.Products;

import com.sun.org.apache.xpath.internal.operations.Bool;
import net.bytebuddy.TypeCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Collections;
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
    public List getAllProducts(String st, Boolean asc){
        if (asc ==Boolean.TRUE){

            return (List)pr.findByNameASC(st);
        }
        else{

            return (List)pr.findByNameDSC(st);
        }
    }

    @Override
    public void deleteById(String id) throws IOException{
        pr.deleteById(id);
    }

}
