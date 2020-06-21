package com.wonders.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class ConsumerController {


    @Autowired
    private RestTemplate restTemplate;

    @Value(value = "${service-url.nacos-user-service}")
    private String serviceURL;

    @GetMapping("/consumer/payment/get/{id}")
    public String paymentInfo(@PathVariable("id") Long id){
        return restTemplate.getForObject("http://"+serviceURL+"/payment/nacos/get/"+id,String.class);
    }
}

