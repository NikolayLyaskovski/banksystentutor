package com.advanced.bank.bank.system.controller;

import com.advanced.bank.bank.system.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")

public class UserController {

    @PostMapping
    public String createUser(@RequestBody User user){
        return "Hello ".concat(user.getFirstName());
    }

    @GetMapping ("/test")
    private String test() {
        return "Hello world";
    }
}
