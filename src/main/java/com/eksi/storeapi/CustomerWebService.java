package com.eksi.storeapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.eksi.storeapi.datatypes.Customer;
import com.eksi.storeapi.ApplicationContext;

@RestController
@RequestMapping("customer")
public class CustomerWebService {
    @RequestMapping("/")
    public Customer customer(@RequestParam(value="customerid", defaultValue="1") String customerid) {
        return ApplicationContext.customersBl().getCustomer(customerid);
    }
}

