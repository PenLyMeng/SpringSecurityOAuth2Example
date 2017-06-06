package com.websystique.springmvc.service.impl;

import com.websystique.springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/**
 * Created by k.tith on 5/6/2017.
 */
@Service("CustomUserDetailService")
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserServiceImpl userService;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user  = userService.findByName("penlymeng");



        System.out.println("name: " + user.getUsername());
        System.out.println("password: " + user.getPassword());



        if(user == null)
        {
            System.out.println("User not found!");
        }
        return user;
    }
}
