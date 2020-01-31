package com.eksi.storeapi.Products;

import com.eksi.storeapi.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class ProductController {

    private ProductService ps = ApplicationContext.productsService();

    @RequestMapping(value = "/products/save", method = RequestMethod.POST)
    public String saveProduct(@RequestBody Product product) throws IOException{
        ps.update(product);
        return "product/success";
    }

    @RequestMapping(value = "/products/getProduct/{id}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable("id") Integer id){
        return ps.getProduct(id);
    }


}
