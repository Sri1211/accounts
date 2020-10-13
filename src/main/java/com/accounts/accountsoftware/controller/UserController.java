package com.accounts.accountsoftware.controller;

import com.accounts.accountsoftware.service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.accounts.accountsoftware.model.User;
import org.springframework.http.ResponseEntity;
import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserInterface userservice;

    @GetMapping("/all")
    public ResponseEntity<List<User>> get(){
       List<User> users = userservice.findAll();
       return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
}
