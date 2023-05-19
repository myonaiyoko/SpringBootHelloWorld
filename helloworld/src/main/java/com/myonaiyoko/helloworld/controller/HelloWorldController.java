package com.myonaiyoko.helloworld.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
    @RequestMapping("/hello")
    @ResponseBody
    public Map<String, String> getHello() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("message", "Hello World!!");
        return map;
    }
}
