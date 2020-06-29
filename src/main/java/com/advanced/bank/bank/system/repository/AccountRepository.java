package com.advanced.bank.bank.system.repository;

import com.advanced.bank.bank.system.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account,Long> {
}
