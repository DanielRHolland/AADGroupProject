package com.eksi.storeapi.bl;

import com.eksi.storeapi.datatypes.Customer;

public interface CustomersBl
{
    Customer getCustomer(String customerId);
}
