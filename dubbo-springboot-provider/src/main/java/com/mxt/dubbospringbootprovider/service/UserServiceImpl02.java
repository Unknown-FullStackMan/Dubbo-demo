package com.mxt.dubbospringbootprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.mxt.user.IUserService;
//import org.springframework.stereotype.Service;   @Service 基于xml方式的引入包

/**
 * @author Simple
 * @date 2021/2/26 16:00
 */
@Service(version = "V2.0.0")
public class UserServiceImpl02 implements IUserService {

    @Override
    public String hello(String name) {
        System.out.println("Hello,SpringBoot");
        System.out.println("版本V2.0.0");
        return "springboot"+name;
    }
}
