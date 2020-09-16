package com.neutroline.Prabinspringboot.entities;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="ACCOUNT_TYPE")
public class AccountType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ACCOUNT_TYPE_ID")
    private Long accountTypeId;

    @Column(name="NAME")
    private String name;

    @Column(name="LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @Column(name="LAST_UPDATED")
    private Date lastUpdated;

    @Column(name="CREATED_BY")
    private String createdBy;

    @Column(name="CREATED_DATE")
    private Date  createdDate;

    public Long getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(Long accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
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
