package com.eksi.storeapi.Products;

import com.eksi.storeapi.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductWebService {
    @RequestMapping("/quantity")
    public int quantity(@RequestParam(value="id", defaultValue="1") String id) {
        return ApplicationContext.productsBl().getQuantity(id);
    }

    @RequestMapping("/info")
    public Product productInformation(@RequestParam(value="id",defaultValue="1") String id) {
        return ApplicationContext.productsBl().getProduct(id);
    }
}