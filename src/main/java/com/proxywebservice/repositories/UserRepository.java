package com.proxywebservice.repositories;


import com.proxywebservice.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by k.tith on 5/6/2017.
 */

@Repository("userRepository")
public interface UserRepository {

    @Select("SELECT * FROM tb_user WHERE username ILIKE '%' || #{username} || '%'")
    @Results({
            @Result(property="id",column="id"),
            @Result(property="firstName",column="first_name"),
            @Result(property="lastName",column="last_name"),
            @Result(property="password",column="password"),

    })
    ArrayList<User> getByUsername(String username);

    void saveUser(User user);






    @Select("SELECT * FROM tb_user")
    @Results({
            @Result(property="id",column="id"),
            @Result(property="firstName",column="first_name"),
            @Result(property="lastName",column="last_name"),
            @Result(property="password",column="password"),
    })
    ArrayList<User> getAllUser();

    User getById(Long id);


    @Insert("INSERT INTO tb_user(id,first_name,last_name,username,password,phone) VALUES(#{id},#{firstName},#{lastName},concat(#{firstName},#{lastName}),#{password},#{phone})")
    boolean signup(User user);

    @Select("SELECT * FROM tb_user WHERE username=concat(#{firstName},#{lastName}) and password = #{password}")
    User login(User user);

    @Update("UPDATE tb_user SET first_name=#{firstName},last_name=#{lastName},username=concat(#{firstName},#{lastName}),password=#{password},phone=#{phone} WHERE id=#{id}")
    boolean updateUser(User user);

    @Delete("DELETE FROM tb_user WHERE id=#{id}")
    boolean removeUser(long id);
}
