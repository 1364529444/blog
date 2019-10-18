package com.cloud.eurekaserverredis.controller;

import com.cloud.eurekaserverredis.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RedisController {
    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("/setObject")
    public String setObject(String key, String value, HttpServletRequest request) {
        String comR = "from  port: ";
        comR += request.getServerPort() + ",Result: ";
        return comR + (redisUtil.set(key, value) ? 1 : 0);
    }

    @RequestMapping("/getObject")
    public Object getObjet(String key, HttpServletRequest request) {
        String comR = "from  port: ";
        comR += request.getServerPort() + ",Result: ";
        return comR + redisUtil.get(key);
    }
}
