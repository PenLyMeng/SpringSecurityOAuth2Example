package com.websystique.springmvc.repositories;


import com.websystique.springmvc.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by k.tith on 5/6/2017.
 */

@Repository("userRepository")
public interface UserRepository {

    @Select("SELECT * FROM Users where username=#{username}")
    User getByUsername(String username);

    void saveUser(User user);

    void updateUser(User user);

    List<User> getAllUser();

    User getById(Long id);
}
