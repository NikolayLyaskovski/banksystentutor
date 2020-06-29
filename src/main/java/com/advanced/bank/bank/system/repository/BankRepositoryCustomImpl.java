package com.advanced.bank.bank.system.repository;

import com.advanced.bank.bank.system.model.Bank;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class BankRepositoryCustomImpl implements BankRepositoryCustom {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public <T> T getReference(Long id, Class<T> tClass) {
        return entityManager.getReference(tClass, id);

    }
}
