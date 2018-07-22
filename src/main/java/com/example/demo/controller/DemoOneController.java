package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jason on 2018/7/22.
 */
@RestController
@RequestMapping(value = "/demoOne")
public class DemoOneController {

    @GetMapping(value = "")
    public Map getMap(){
        Map map = new HashMap();
        map.put("a","hello");
        return map;
    }
}
