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
    private String id;
    @Column(name = "nNumber")
    private String nNumber;
    @Column(name = "budget_code")
    private String budgetCode;
    @Column(name = "timestamp")
    private long timeStamp;

    public Transaction(String transactionId, String budgetCode, String nNumber, long timeStamp) {
        this.budgetCode = budgetCode;
        this.id = transactionId;
        this.nNumber = nNumber;
        this.timeStamp = timeStamp;
    }

    public Transaction(){}

    public String getTransactionId() {
        return id;
    }

    public void setTransactionId(String transactionId) {
        this.id = transactionId;
    }

    public String getnNumber() {
        return nNumber;
    }

    public void setnNumber(String nNumber) {
        this.nNumber = nNumber;
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