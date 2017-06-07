package com.proxywebservice.service;

import java.util.ArrayList;
import java.util.List;

import com.proxywebservice.model.User;


public interface UserService {
	
	User findById(long id);
	
	ArrayList<User> findByName(String name);
	
	void saveUser(User user);
	

	
	void deleteUserById(long id);

	List<User> findAllUsers(); 
	
	void deleteAllUsers();
	
	boolean isUserExist(User user);

	User login(User user);
	boolean signup(User user);
    boolean updateUser(User user);
	boolean removeUser(long id);


}
