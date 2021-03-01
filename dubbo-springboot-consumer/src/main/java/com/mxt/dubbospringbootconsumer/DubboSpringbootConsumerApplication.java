package com.mxt.dubbospringbootconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource(locations = "classpath:dubbo-consumer.xml")
@EnableDubbo
public class DubboSpringbootConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboSpringbootConsumerApplication.class, args);
	}

}
