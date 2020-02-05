package com.eksi.storeapi.Products;

import com.eksi.storeapi.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RequestMapping(value = "/product")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ProductController {

    @Autowired
    private ProductService ps = ApplicationContext.productsService();

    @PostMapping(value = "/s")
    public String saveProduct(@RequestBody Product product) throws IOException{
        ps.update(product);
        return "product/success";
    }

    @GetMapping(value = "/g/{id}")
    public Product getProduct(@PathVariable("id") String product_id){
        return ps.getProduct(product_id);
    }

    @GetMapping(value = "/l")
    public List getProducts(){
        return (List) ps.getAllProducts();
    }

}
