package com.accounts.accountsoftware.service;

import com.accounts.accountsoftware.model.User;
import com.accounts.accountsoftware.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserInterface {
    @Autowired
    UserRepository userrepository;

    @Override
    public List<User> findAll() {
        return userrepository.findAll();
    }
}
