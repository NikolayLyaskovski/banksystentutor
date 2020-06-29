package com.advanced.bank.bank.system.service;

import com.advanced.bank.bank.system.model.Address;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {
    void createAddress(Address address);

    void updateAddress(Address address);

    Address getAddressById(Long addressId);

    List<Address> getAllAddresses();

    void deleteAddressById(Long addressId);
}
