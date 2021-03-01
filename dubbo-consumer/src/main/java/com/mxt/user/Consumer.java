package com.mxt.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author Simple
 * @date 2021/2/26 15:35
 */
public class Consumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        context.start();
        //调用远程服务
        IUserService userService=context.getBean(IUserService.class);
        System.out.println(userService.hello("dubbo"));
        System.in.read();
    }
}
