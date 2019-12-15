package com.eksi.storeapi.blimpl;

import com.eksi.storeapi.bl.CustomersBl;
import com.eksi.storeapi.datatypes.Customer;

public class CustomersBlImpl implements CustomersBl
{
    @Override
    public Customer getCustomer(String customerId) 
    {
        return new Customer(customerId);
    }
}
