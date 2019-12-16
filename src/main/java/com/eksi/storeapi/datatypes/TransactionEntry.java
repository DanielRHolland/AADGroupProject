package com.eksi.storeapi.datatypes;

public class TransactionEntry
{ 
    private String transactionEntryId;
    private String productId; 
    private int quantity;
    
    public String getTransactionEntryId(){
        return transactionEntryId;
    }
    
    // Constructor
    public TransactionEntry(final String transactionEntryId){   
        this.transactionEntryId = transactionEntryId;
    }
    
    public String getProductId(){
        return productId;
    }
        
    public void setProductId(final String productId){
        this.productId = productId;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public void setQuantity(final int quantity){
        this.quantity = quantity;
    }
}
