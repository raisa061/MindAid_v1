package com.example.MindAid.model;

import org.springframework.stereotype.Repository;

import javax.persistence.*;
@Repository
@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    public int id;
    @Column(name = "method")
    public String method;
    @Column(name = "acc_no")
    public String acc_no;
    @Column(name = "trxID")
    public String trxID;
    @Column(name = "reference")
    public String reference;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public String getTrxID() {
        return trxID;
    }

    public void setTrxID(String trxID) {
        this.trxID = trxID;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
