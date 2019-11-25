package com.eksi.storeapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductWebService {
    @RequestMapping("/quantity")
    public int quantity(@RequestParam(value="id", defaultValue="1") String id) {
        return Integer.parseInt(id);
    }
}
