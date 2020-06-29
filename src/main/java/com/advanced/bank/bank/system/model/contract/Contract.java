package com.advanced.bank.bank.system.model.contract;

import com.advanced.bank.bank.system.model.Account;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "contracts")
public class Contract {

    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
    @Column(name = "expires_on")
    private Instant expiresOn;
    @Column(name = "date_created")
    private Instant dateCreated;
    @ManyToOne
    @JoinColumn(name = "contract_details_id")
    private ContractDetails contractDetails;

    public Long getId() {
        return id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Instant getExpiresOn() {
        return expiresOn;
    }

    public void setExpiresOn(Instant expiresOn) {
        this.expiresOn = expiresOn;
    }

    public Instant getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Instant dateCreated) {
        this.dateCreated = dateCreated;
    }

    public ContractDetails getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(ContractDetails contractDetails) {
        this.contractDetails = contractDetails;
    }
}
