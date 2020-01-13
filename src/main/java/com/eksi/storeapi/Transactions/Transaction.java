package com.eksi.storeapi.Transactions;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.*;

@Entity
@Table(name = "Transactions")
public class Transaction {
    @Id
    @Column(name = "transaction_id")
    private String transactionId;
    @Column(name = "customer_id")
    private String customerId;
    @Column(name = "budget_code")
    private String budgetCode;
    @Column(name = "timestamp")
    private long timeStamp;
    private List<TransactionEntry> transactionEntries;
    
    public String getTransactionId(){
        return transactionId;
    }
    
    // Constructor
    public Transaction(final String id){   
        this.transactionId = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
