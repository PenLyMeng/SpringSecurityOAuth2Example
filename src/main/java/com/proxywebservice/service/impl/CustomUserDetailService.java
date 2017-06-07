package com.proxywebservice.service.impl;

import com.proxywebservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


/**
 * Created by k.tith on 5/6/2017.
 */
@Service("CustomUserDetailService")
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserServiceImpl userService;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        ArrayList<User> arrayList  = userService.findByName(s);
        User user = arrayList.get(0);

        System.out.println("user " + user  );

     /*   User user = new User();
        user.setUsername("penlymeng");
        user.setPassword("Penlymeng123");*/

        System.out.println("name: " + user.getUsername());
        System.out.println("password: " + user.getPassword());



        if(user == null)
        {
            System.out.println("User not found!");
        }
        return user;
    }
}
