package com.advanced.bank.bank.system.repository;

import com.advanced.bank.bank.system.model.Bank;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepositoryCustom {
    <T> T getReference(Long id, Class<T> tClass);
}
