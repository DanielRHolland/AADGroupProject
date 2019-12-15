package com.eksi.storeapi.datatypes;

public class Customer {
    private String customerId;
    private String budgetCode;
    
    public String getCustomerId(){
        return customerId;
    }
    
    public String getbudgetCode(){
        return budgetCode;
    }
    
    public void setbudgetCode(final String budgetCode){
        this.budgetCode = budgetCode;
    }
    public Customer(final String id) {
        
        this.customerId = id;
    }
}
    
