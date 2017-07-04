package com.springDemo.service;

import com.springDemo.dao.UserDao;
import com.springDemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by huyingxiang on 17/2/10.
 */
@Service("service")
public class UserService {

    @Autowired
    private UserDao userDao;

    public boolean addUser(User user){
        return userDao.addUser(user);
    };
    public boolean delUser(int id){
        return userDao.delUser(id);
    }
}
