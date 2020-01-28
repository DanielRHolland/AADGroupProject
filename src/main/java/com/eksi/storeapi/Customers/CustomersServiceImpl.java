package com.eksi.storeapi.Customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersServiceImpl implements CustomersService {
    @Autowired
    private CustomerRepository cr;

    //WHEN USING DATABASE USE cr.

    @Override
    public Customer getCustomer(String customerId) 
    {
        return new Customer(customerId);
    }


}
