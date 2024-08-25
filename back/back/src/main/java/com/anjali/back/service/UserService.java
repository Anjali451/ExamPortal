package com.anjali.back.service;

import com.anjali.back.model.User;
import com.anjali.back.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo repo;

    //add or update user
    public User addOrUpdate(User user){
        return this.repo.save(user);
    }
}
