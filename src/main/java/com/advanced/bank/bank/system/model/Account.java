package com.advanced.bank.bank.system.model;

import com.advanced.bank.bank.system.model.enums.AccountType;

import javax.persistence.*;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    private Long id;
    @Column
    private String iban;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User owner;
    @Column
    private Long balance;
    @Column(name = "account_type")
    @Enumerated(EnumType.STRING)
    private AccountType accountType = AccountType.NONE;
    @ManyToOne
    @JoinColumn(name = "currency_id")
    private Currency currency;

    public Long getId() {
        return id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
