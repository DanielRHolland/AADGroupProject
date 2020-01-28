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
    @Column(name = "staff_id")
    private String staffId;
    @Column(name = "budget_code")
    private String budgetCode;
    @Column(name = "timestamp")
    private long timeStamp;

    public String TransactionId() {
        return transactionId;
    }

    // Constructor
    public Transaction(){

    }
    public Transaction(final String id) {
        this.transactionId = id;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getBudgetCode() {
        return budgetCode;
    }

    public void setBudgetCode(final String budgetCode) {
        this.budgetCode = budgetCode;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(final long timeStamp) {
        this.timeStamp = timeStamp;
    }

}