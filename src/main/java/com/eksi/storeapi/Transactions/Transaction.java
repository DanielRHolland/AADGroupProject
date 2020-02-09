package com.eksi.storeapi.Transactions;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "Transactions")
public class Transaction {
    @Id @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "transaction_id")
    private String transactionId;
    @Column(name = "budget_code")
    private String budgetCode;
    @Column(name = "nNumber")
    private String nNumber;
    @Column(name = "timestamp")
    private long timeStamp;

    public String TransactionId() {
        return transactionId;
    }

    public Transaction(String transactionId, String budgetCode, String nNumber, long timeStamp) {
        this.budgetCode = budgetCode;
        this.transactionId = transactionId;
        this.nNumber = nNumber;
        this.timeStamp = timeStamp;
    }

    public Transaction(){}

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getnNumber() {
        return nNumber;
    }

    public void setnNumber(String nNumber) {
        this.nNumber = nNumber;
    }

    public Transaction(final String id) {
        this.transactionId = id;
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