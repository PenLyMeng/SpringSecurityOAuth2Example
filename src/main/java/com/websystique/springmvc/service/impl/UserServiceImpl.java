package com.websystique.springmvc.service.impl;


import com.websystique.springmvc.model.User;
import com.websystique.springmvc.repositories.UserRepository;
import com.websystique.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by k.tith on 5/6/2017.
 */

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    @Qualifier("userRepository")
    UserRepository userRepository;


    @Override
    public User findById(long id) {
        return null;
    }

    @Override
    public User findByName(String name) {
        return userRepository.getByUsername(name);
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUserById(long id) {

    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }

    @Override
    public void deleteAllUsers() {

    }

    @Override
    public boolean isUserExist(User user) {
        return false;
    }

    /*@Autowired*/
   // private UserRepository userRepository;





   /* @Override
    public User findUserByUsername(String username) {
        return userRepository.getByUsername(username);
    }

    @Override
    public void update(User user) {
        userRepository.updateUser(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.getAllUser();
    }

    @Override
    public User getById(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public void saveUser(User user) {
        userRepository.saveUser(user);
    }*/
}
