package com.epoint.dubbo.provider;

import com.epoint.dubbo.api.UserService;

public class UserServiceImpl implements UserService {
    public String sayHi(String s) {
    	System.out.println("��һ�����񱻵���----------");
        return "hello " + s + "!";
    }
}