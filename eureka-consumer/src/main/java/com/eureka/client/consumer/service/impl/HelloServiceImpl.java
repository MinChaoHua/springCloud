package com.eureka.client.consumer.service.impl;

import com.eureka.client.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String myDemo(String message) {
        return restTemplate.getForObject("http://eureka-client/index?message="+message,String.class);
    }
}
