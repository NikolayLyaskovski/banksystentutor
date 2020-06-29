package com.advanced.bank.bank.system.controller;

import com.advanced.bank.bank.system.exception.NoResultsFoundException;
import com.advanced.bank.bank.system.model.Bank;
import com.advanced.bank.bank.system.service.BankService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/banks")
public class BankController {

    private final BankService bankService;

    @Autowired
    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @PostMapping
    public void createBank(@RequestBody Bank bank){
        bankService.createBank(bank);
    }

    @PutMapping
    public void updateBank(@RequestBody Bank bank){

    }

    @GetMapping
    public Iterable<Bank> getAllBanks(){
        return bankService.getAllBanks();
    }

    @GetMapping("/{bankId}")
    public Bank getBank(@PathVariable Long bankId){
        return bankService.getBankById(bankId);
    }

    @DeleteMapping("/{bankId}")
    public void deleteBank(@PathVariable Long bankId){

    }

    @ExceptionHandler({NoResultsFoundException.class})
    public ResponseEntity<Object> handleExceptions(NoResultsFoundException e){
        return ResponseEntity.ok("{\"message:\"no results\"}");
    }
}
