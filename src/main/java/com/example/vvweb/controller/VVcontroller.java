package com.example.vvweb.controller;

import com.example.vvweb.Void.User;
import com.example.vvweb.Void.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("VV")
public class VVcontroller {

    @Autowired
    private UserRepository repository;
    @GetMapping
    public List<User> getAll(){
        List<User> usersList = repository.findAll();
        return usersList;
    }
}
