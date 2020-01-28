package com.eksi.storeapi.Customers;

import com.eksi.storeapi.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.eksi.storeapi.Customers.Customer;

@RestController
@RequestMapping("customer")
public class CustomerController {
    @RequestMapping("/")
    public Customer customer(@RequestParam(value="customerid", defaultValue="1") String customerid) {
        return ApplicationContext.customersBl().getCustomer(customerid);
    }
}

