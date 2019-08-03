package com.mch.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDemoController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/index")
    public String sayHello(String message){
        return String.format("you message is: %s port:%s",port,message);
    }
}
