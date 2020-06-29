package com.advanced.bank.bank.system.service;

import com.advanced.bank.bank.system.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    void createUser(User user);

    void updateUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();

    void deleteUserById(Long id);
}
