package com.proxywebservice.service.impl;


import com.proxywebservice.model.User;
import com.proxywebservice.service.UserService;
import com.proxywebservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public ArrayList<User> findByName(String name) {
        return userRepository.getByUsername(name);
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public boolean updateUser(User user) {
            return userRepository.updateUser(user);
    }

    @Override
    public boolean removeUser(long id) {
        return userRepository.removeUser(id);
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

    @Override
    public User login(User user) {
        return userRepository.login(user);
    }

    @Override
    public boolean signup(User user) {
        return userRepository.signup(user);
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
