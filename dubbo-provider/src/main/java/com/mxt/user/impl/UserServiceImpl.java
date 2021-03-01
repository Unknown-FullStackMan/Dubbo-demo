package com.mxt.user.impl;

import com.mxt.user.IUserService;

/**
 * @author Simple
 * @date 2021/2/26 14:53
 * 把这个实现作为一个服务发布出来，方便其他工程调用
 */
public class UserServiceImpl implements IUserService {

    public String hello(String name) {
        System.out.println(name);
        return "helo"+name;
    }
}
