package com.springDemo.dao;

import com.springDemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.util.List;


/**
 * Created by huyingxiang on 17/1/11.
 */


public interface UserDao {
    boolean addUser(User user);
    boolean delUser(int id);
}
