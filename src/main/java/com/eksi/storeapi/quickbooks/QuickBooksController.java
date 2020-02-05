package com.eksi.storeapi.quickbooks;

import com.eksi.storeapi.ApplicationContext;
import com.eksi.storeapi.Products.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RequestMapping(value = "/quickbooks")
@RestController
public class QuickBooksController {
    private QuickBooksService qb = ApplicationContext.quickBooksService();

    @PostMapping(value = "/po")
    public String saveProduct(@RequestBody String jsonQuery) throws IOException {
        return qb.createPurchaseOrder(jsonQuery);
    }



}
