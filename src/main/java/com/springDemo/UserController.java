package com.springDemo;

import com.springDemo.model.User;
import com.springDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by huyingxiang on 17/2/9.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/add")
    public String add(HttpServletRequest request){
        User user = new User();
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        user.setPassword(password);
        user.setUserName(userName);System.out.println(user);
        return  "***"+userService.addUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/del")
    public String delete(HttpServletRequest request){
        String userID = request.getParameter("userId");
        int userid = Integer.valueOf(userID);
        if(userService.delUser(userid)){
            return "true";
        }
        else return "false";
    }
}
