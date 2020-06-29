package com.advanced.bank.bank.system.service;

import com.advanced.bank.bank.system.exception.NoResultsFoundException;
import com.advanced.bank.bank.system.model.Address;
import com.advanced.bank.bank.system.model.Bank;
import com.advanced.bank.bank.system.repository.AddressRepository;
import com.advanced.bank.bank.system.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class BankServiceImpl implements BankService {

    private final BankRepository bankRepository;
    private final AddressRepository addressRepository;

    @Autowired
    public BankServiceImpl(BankRepository bankRepository, AddressRepository addressRepository) {
        this.bankRepository = bankRepository;
        this.addressRepository = addressRepository;
    }


    @Override
    public void createBank(Bank bank) {

        validateBank(bank);

        if (null != bank.getAddress().getId()) {
            Address addressReference = bankRepository.getReference(bank.getAddress().getId(), Address.class);
            bank.setAddress(addressReference);
            addressRepository.save(bank.getAddress());
        }else{
            addressRepository.save(bank.getAddress());
        }


        bankRepository.save(bank);
    }

    @Override
    public void updateBank(Bank bank) {

    }

    @Override
    public Iterable<Bank> getAllBanks() {
        Pageable pageable = PageRequest.of(0,2);
        return bankRepository.findAll(pageable);
    }

    @Override
    public Bank getBankById(Long bankId) {
        Optional<Bank> bankEntity = bankRepository.findById(bankId);

        if (bankEntity.isPresent()){
            return bankEntity.get();
        }

        throw new NoResultsFoundException();
    }

    @Override
    public void deleteBankById(Long bankId) {

    }

    private void validateBank(Bank bank) {
        if (null == bank.getAddress()) {
            throw new IllegalArgumentException("Invalid address");

        }
    }
}
