package com.cloud.eurekaserverredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaServerRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerRedisApplication.class, args);
    }

}
