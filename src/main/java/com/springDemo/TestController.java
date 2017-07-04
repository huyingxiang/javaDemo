package com.springDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by huyingxiang on 17/2/24.
 */
@Controller
@RequestMapping("/index")
public class TestController {
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String toAdd(){
        return "add";
    }
}
