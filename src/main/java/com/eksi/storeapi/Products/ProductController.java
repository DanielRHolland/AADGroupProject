package com.eksi.storeapi.Products;

import com.eksi.storeapi.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RequestMapping(value = "/products")
@RestController
public class ProductController {

    private ProductService ps = ApplicationContext.productsService();

    @PostMapping(value = "/s")
    public String saveProduct(@RequestBody Product product) throws IOException{
        ps.update(product);
        return "product/success";
    }

    @GetMapping(value = "/g/{id}")
    public Product getProduct(@PathVariable("id") Integer id){
        return ps.getProduct(id);
    }


}
