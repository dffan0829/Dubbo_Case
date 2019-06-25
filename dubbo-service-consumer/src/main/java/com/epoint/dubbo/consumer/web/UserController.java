package com.epoint.dubbo.consumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.epoint.dubbo.api.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/dubbo")
    @ResponseBody
    public String sayHello(@RequestParam("name") String name) {
        String welcome = userService.sayHi(name);
        return welcome;
    }
}
