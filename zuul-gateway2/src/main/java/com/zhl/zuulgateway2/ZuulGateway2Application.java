package com.zhl.zuulgateway2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ZuulGateway2Application {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGateway2Application.class, args);
    }

}

