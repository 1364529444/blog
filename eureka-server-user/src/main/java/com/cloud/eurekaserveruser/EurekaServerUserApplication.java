package com.cloud.eurekaserveruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaServerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerUserApplication.class, args);
    }

}
