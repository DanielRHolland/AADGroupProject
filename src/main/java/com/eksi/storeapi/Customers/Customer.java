package com.eksi.storeapi.Customers;

import javax.persistence.*;

@Entity
@Table(name = "Customers")
public class Customer {

    @Id
    @Column(name = "customer_id")
    private String customerId;
    private String username;
    private String passwordHash;
    private int privLevel;
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getPrivLevel() {
        return privLevel;
    }

    public void setPrivLevel(int privLevel) {
        this.privLevel = privLevel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getCustomerId(){
        return customerId;
    }

    public Customer(final String id) {
        this.customerId = id;
    }
}
    
