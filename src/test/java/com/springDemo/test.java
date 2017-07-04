package com.springDemo;

import com.springDemo.service.UserService;
import com.springDemo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by huyingxiang on 17/1/11.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml"})//导入配置文件
public class test {

    @Autowired
    private UserService userservice;

    @Test
    public void testadd(){
        User user = new User();
        System.out.println(user);
        user.setUserName("111");
        user.setPassword("abccba");
        System.out.println(user);
        System.out.println("********"+userservice);
        System.out.println(userservice.addUser(user));
    }

    @Test
    public void testDel(){
        String s = new String();

    }
}
