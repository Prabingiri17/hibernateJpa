package com.neutroline.Prabinspringboot.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="BANK")
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="BANK_ID")
    private Long bankId;

    @Column(name="NAME")
    private String name;

    @Column(name="ADDRESS_LINE1")
    private String addressLine1;

    @Column(name="ADDRESS_LINE2")
    private String addressLine2;

    @Column(name="CITY")
    private String city;

    @Column(name="STATE")
    private String state;

    @Column(name="ZIPCODE")
    private String zipCode;

    @Column(name="LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @Column(name="LAST_UPDATED_DATE")
    private Date lastUpdatedDate;

    @Column(name="CREATED_BY")
    private String createdBy;

    @Column(name="CREATED_DATE")
    private Date createdDate;

    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
