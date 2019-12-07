package com.eksi.storeapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.eksi.storeapi.datatypes.ProductInformation;
import com.eksi.storeapi.bl.ProductsBl;

@RestController
@RequestMapping("products")
public class ProductWebService {
    @RequestMapping("/quantity")
    public int quantity(@RequestParam(value="id", defaultValue="1") String id) {
        return ApplicationContext.productsBl().getQuantity(id);
    }

    @RequestMapping("/info")
    public ProductInformation productInformation(@RequestParam(value="id",defaultValue="1") String id) {
        return ApplicationContext.productsBl().getProduct(id);
    }
}
