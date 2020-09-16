package com.neutroline.Prabinspringboot.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
@Entity
@Table (name="ACCOUNT")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ACCOUNT_ID")
    private Long accountId;

    @Column(name="BANK_ID")
    private Long bankId;

    @Column(name="ACCOUNT_TYPE")
    private Long accountType;

    @Column(name="NAME")
    private String name;

    @Column(name="INITIAL_BALANCE")
    private BigDecimal initialBalance;

    @Column(name="CURRENT_BALANCE")
    private BigDecimal currentBalance;

    @Column(name="OPEN_DATE")
    private Date openDate;

    @Column(name="CLOSE_DATE")
    private Date closeDate;

    @Column(name="LAST_UPDATE_BY")
    private String lastUpdatedBy;

    @Column(name="DATE_TIME")
    private Date dateTime;

    @Column(name="CREATED_BY")
    private String createdBy;

    @Column(name="CREATED_DATE")
    private Date createdDate;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    public Long getAccountType() {
        return accountType;
    }

    public void setAccountType(Long accountType) {
        this.accountType = accountType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(BigDecimal initialBalance) {
        this.initialBalance = initialBalance;
    }

    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
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
