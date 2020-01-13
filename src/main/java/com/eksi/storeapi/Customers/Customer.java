package com.eksi.storeapi.Customers;

public class Customer {
    private String customerId;
    private String budgetCode;
    
    public String getCustomerId(){
        return customerId;
    }
    
    public String getBudgetCode(){
        return budgetCode;
    }
    
    public void setBudgetCode(final String budgetCode){
        this.budgetCode = budgetCode;
    }

    public Customer(final String id) {
        this.customerId = id;
    }
}
    
