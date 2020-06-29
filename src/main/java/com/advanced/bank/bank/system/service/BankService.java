package com.advanced.bank.bank.system.service;

import com.advanced.bank.bank.system.model.Bank;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BankService {

    void createBank(Bank bank);
    void updateBank(Bank bank);
    Iterable<Bank> getAllBanks();
    Bank getBankById(Long bankId);
    void deleteBankById(Long bankId);
}
