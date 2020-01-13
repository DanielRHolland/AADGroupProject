package com.eksi.storeapi.Transactions;

import java.util.*;

public class Transaction {
    private String transactionId;
    private String userId;
    private String budgetCode;
    private long timeStamp;
    private List<TransactionEntry> transactionEntries;
    
    public String getTransactionId(){
        return transactionId;
    }
    
    // Constructor
    public Transaction(final String id){   
        this.transactionId = id;
    }
    
    public String getUserId(){
        return userId;
    }
    
    public void setUserId(final String userId){
        this.userId = userId;
    }
    
    public String getBudgetCode(){
        return budgetCode;
    }
    
    public void setBudgetCode(final String budgetCode){
        this.budgetCode = budgetCode;
    }
    
    public long getTimeStamp(){
        return timeStamp;
    }
    
    public void setTimeStamp(final long timeStamp){
        this.timeStamp = timeStamp;
    }
    
    public List getTransactionEntries(){
        return transactionEntries;
    }
    
    public void setTransactionEntries(final List transactionEntries){
        this.transactionEntries = transactionEntries;
    }
}
