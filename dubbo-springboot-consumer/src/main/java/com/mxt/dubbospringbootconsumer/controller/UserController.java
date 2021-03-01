package com.mxt.dubbospringbootconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mxt.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Simple
 * @date 2021/2/26 16:14
 */
@RestController
@RequestMapping("/user")
public class UserController {


    //细粒度的控制
    @Reference(loadbalance = "roundrobin",timeout = 5000,version = "V2.0.0",stub = "com.mxt.user.UserServiceImplStub")
    /*@Reference(loadbalance = "leastActive")*/
    /*@Reference(loadbalance = "consistenthash")一致性Hash算法*/
    private IUserService userService;

    @RequestMapping("/hello")
    public String hello(String name){
        //调用远程服务
/*        //有效调用
        //假设name是必须要的
        if (name == null || "".equals(name.trim())) {
            return "无效参数";
        }*/
        return  userService.hello(name);
    }
}
