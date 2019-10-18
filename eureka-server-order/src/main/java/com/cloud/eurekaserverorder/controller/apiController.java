package com.cloud.eurekaserverorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class apiController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/setOrder")
    public String setOrder(String key, String value) {
        return restTemplate.getForObject("http://redis/setObject?key=" + key + "&value=" + value, String.class);
    }

    @RequestMapping("/getOrder")
    public String getOrder(String key) {
        return restTemplate.getForObject("http://redis/getObject?key=" + key, String.class);

    }

}
