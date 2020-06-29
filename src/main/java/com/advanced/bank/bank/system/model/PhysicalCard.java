package com.advanced.bank.bank.system.model;

import com.advanced.bank.bank.system.model.enums.CardType;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "physical_cards")
public class PhysicalCard {

    @Id
    private Long id;
    @Column
    private Integer cardNumber;
    @Column
    @Enumerated(EnumType.STRING)
    private CardType cardType = CardType.NONE;
    @Column
    private Instant expirationDate;
    @Column
    private Integer cvv;
    @Column
    private Integer pinCode;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
    @Column
    boolean isActive = false;

    public Long getId() {
        return id;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public Instant getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Instant expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
