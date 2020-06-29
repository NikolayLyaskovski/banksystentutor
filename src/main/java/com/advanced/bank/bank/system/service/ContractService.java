package com.advanced.bank.bank.system.service;

import com.advanced.bank.bank.system.model.contract.Contract;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContractService {
    void createContract(Contract contract);
    void updateContract(Contract contract);
    List<Contract> getAllContracts();
    Contract getContractById(Long contractId);
    void deleteContractById(Long contractId);
}
