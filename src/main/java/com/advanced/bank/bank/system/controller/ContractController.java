package com.advanced.bank.bank.system.controller;

import com.advanced.bank.bank.system.model.contract.Contract;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/contracts")
public class ContractController {
    @PostMapping
    public void createContract(@RequestBody Contract contract){

    }
    @PutMapping
    public void updateContract(@RequestBody Contract contract){

    }
    @GetMapping
    public List<Contract> getAllContracts(){
        return null;
    }
    @GetMapping("/{contractId}")
    public Contract getContract(@PathVariable Long contractId){
        return new Contract();
    }
    @DeleteMapping("/{contractId}")
    public void deleteContract(@PathVariable Long contractId){

    }
}
