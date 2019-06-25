package com.epoint.dubbo.provider;

import com.epoint.dubbo.api.UserService;

public class UserServiceImpl implements UserService {
    public String sayHi(String s) {
    	System.out.println("第一个服务被调用----------");
        return "hello " + s + "!";
    }
}