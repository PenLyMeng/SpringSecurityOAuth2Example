package com.proxywebservice.repositories;


import com.proxywebservice.model.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by k.tith on 5/6/2017.
 */

@Repository("userRepository")
public interface UserRepository {

    @Select("SELECT * FROM tb_user WHERE username ILIKE '%' || #{username} || '%'")
    @Results({
            @Result(property="role",column="role"),
            @Result(property="username",column="username"),
            @Result(property="password",column="password"),

    })
    ArrayList<User> getByUsername(String username);

    void saveUser(User user);

    void updateUser(User user);




    @Select("SELECT * FROM tb_user")
    @Results({
            @Result(property="role",column="role"),
            @Result(property="username",column="username"),
            @Result(property="password",column="password"),

    })
    ArrayList<User> getAllUser();

    User getById(Long id);
}
