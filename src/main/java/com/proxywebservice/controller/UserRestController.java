package com.proxywebservice.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
 
import com.proxywebservice.model.User;
import com.proxywebservice.service.UserService;
 
@RestController
public class UserRestController {
 
    @Autowired
    UserService userService;  //Service which will do all data retrieval/manipulation work





    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public boolean login() {

        User user = new User();
        user.setId(0);
        user.setFirstName("pen");
        user.setLastName("lymeng");
        user.setPassword("Penlymeng123");
        user.setPhone("086585891");

        if( userService.login(user) == null){
            return false;
        }

        return  true;
    }

    @RequestMapping(value = "/user/signup", method = RequestMethod.POST)
    public boolean signUp() {
        User user = new User();
        user.setId(0);
        user.setFirstName("pen");
        user.setLastName("lymeng");
        user.setPassword("Penlymeng123");
        user.setPhone("086585891");


        return  userService.signup(user);
    }


    @RequestMapping(value = "/user/update", method = RequestMethod.PATCH)
    public boolean updateUser() {
        User user = new User();
        user.setId(1);
        user.setFirstName("pen");
        user.setLastName("lymeng");
        user.setPassword("Penlymeng123");
        user.setPhone("086585891");


        return  userService.updateUser(user);
    }




    @RequestMapping(value = "api/user/remove", method = RequestMethod.DELETE)
    public boolean deleteUser() {
        return  userService.removeUser(0);
    }

    }

 
