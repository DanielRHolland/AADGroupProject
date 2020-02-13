package com.eksi.storeapi.Products;

import com.eksi.storeapi.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RequestMapping(value = "/product")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ProductController {
    @Autowired
    private ProductService ps = ApplicationContext.productsService();

    @PostMapping(value = "/s")
    public Product saveProduct(@RequestBody Product product) throws IOException{
        ps.update(product);
        return product;
    }

    @GetMapping(value = "/g/{id}")
    public Product getProduct(@PathVariable("id") String product_id){
        return ps.getProduct(product_id);
    }

    //changed this
    @GetMapping(value = "/l")
    public List getProducts(@RequestParam Optional<String> name,
                            @RequestParam Optional<Boolean> order){
        return ps.getAllProducts(name.orElse("_"), order.orElse(Boolean.TRUE));
    }

    @DeleteMapping(value = "/d/{id}")
    public String deleteProduct(@PathVariable String id) throws IOException {
        ps.deleteById(id);
        return "product/delete/success";
    }



}
