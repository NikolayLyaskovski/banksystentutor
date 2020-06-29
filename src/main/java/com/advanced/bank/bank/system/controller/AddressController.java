package com.advanced.bank.bank.system.controller;

import com.advanced.bank.bank.system.model.Address;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/addresses")
public class AddressController {

    @PostMapping
    public void createAddress(@RequestBody Address address){

    }

    @PutMapping
    public void updateAddress(@RequestBody Address address){

    }

    @GetMapping
    public List<Address> getAllAddresses(){
        return null;
    }

    @GetMapping("/{addressId}")
    public Address getAddress(@PathVariable Long addressId){
        return null;
    }

    @DeleteMapping("/{addressId}")
    public void deleteAddress(@PathVariable("addressId") Long addressId){

    }
}
