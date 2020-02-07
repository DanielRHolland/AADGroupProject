package com.eksi.storeapi.Staff;

import javax.persistence.*;

@Entity
@Table(name = "Staff")
public class Staff {

    @Id
    @Column(name = "staff_id")
    private String id;
    private String username;
    private String passwordHash;
    private int privLevel;

    public int getPrivLevel() {
        return privLevel;
    }

    public void setPrivLevel(int privLevel) {
        this.privLevel = privLevel;
    }

    public String getUsername() {
        return username;
    }

    public String getnNumber() {
        return this.id;
    }

    public void setnNumber(String nNumber) {
        this.id = nNumber;
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

}
    
