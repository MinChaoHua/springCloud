package com.eureka.client.consumer.controller;

import com.eureka.client.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/index")
    public String sayHello(String message){
        return helloService.myDemo(message);
    }
}
