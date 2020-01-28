package com.eksi.storeapi.Products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class ProductController {
    @Autowired
    private ProductServiceImpl pi;

    @RequestMapping(value = "/products/save", method = RequestMethod.POST)
    public String saveProduct(@RequestBody Product product) throws IOException{
        pi.update(product);
        return "product/success";
    }

    @RequestMapping(value = "/products/getProduct/{id}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable("id") Integer id){
        return pi.getProduct(id);
    }


}
