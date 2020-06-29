package com.advanced.bank.bank.system.model;

import com.advanced.bank.bank.system.model.enums.TransactionStatus;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "sender_id")
    private Account sender;
    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private Account receiver;
    @Column
    private String description;
    @Column(name = "date_created")
    private Instant dateCreated;
    @Column(name = "date_completed")
    private Instant dateCompleted;
    @Column(name = "date_updated")
    private Instant dateUpdated;
    @Column
    @Enumerated(EnumType.STRING)
    private TransactionStatus transactionStatus = TransactionStatus.NEW;
    @Column
    private Long fee;
    @Column
    private Long amount;

    public Long getId() {
        return id;
    }

    public Account getSender() {
        return sender;
    }

    public void setSender(Account sender) {
        this.sender = sender;
    }

    public Account getReceiver() {
        return receiver;
    }

    public void setReceiver(Account receiver) {
        this.receiver = receiver;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Instant dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Instant getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Instant dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public Instant getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Instant dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
