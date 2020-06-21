package com.wonders.springcloud.controller;

import com.wonders.springcloud.entity.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PaymentController {

    @Value(value = "${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/nacos/get/{id}")
    public String getPayment(@PathVariable(value = "id") Long id){
        return "Hello Nacos Discovery,ServerPort: " + serverPort+"\t id:"+id;
    }

}
