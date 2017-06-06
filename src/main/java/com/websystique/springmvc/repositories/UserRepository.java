package com.websystique.springmvc.repositories;


import com.websystique.springmvc.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by k.tith on 5/6/2017.
 */

@Repository
public interface UserRepository {

    @Select("SELECT * FROM sis_banner where school_id=#{sid} LIMIT #{paging.limit} OFFSET #{paging.offset}")
    User getByUsername(String username);

    void saveUser(User user);

    void updateUser(User user);

    List<User> getAllUser();

    User getById(Long id);
}
