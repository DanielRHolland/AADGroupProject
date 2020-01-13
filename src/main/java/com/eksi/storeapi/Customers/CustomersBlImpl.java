package com.eksi.storeapi.Customers;

public class CustomersBlImpl implements CustomersBl
{
    @Override
    public Customer getCustomer(String customerId) 
    {
        return new Customer(customerId);
    }
}
