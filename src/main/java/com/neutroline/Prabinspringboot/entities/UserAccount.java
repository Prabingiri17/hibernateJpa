package com.neutroline.Prabinspringboot.entities;

import javax.persistence.*;

@Entity
@Table (name="USER_ACCOUNT")
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="USER_ID")
    private Long userId;

    @Column (name="ACCOUNT_ID")
    private Long accountId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}
