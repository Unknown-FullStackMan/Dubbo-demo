package com.mxt.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author Simple
 * @date 2021/2/26 15:13
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("dubbo-provider.xml");
        context.start();
        System.out.println("provider-spring");
        System.in.read();
    }
}
