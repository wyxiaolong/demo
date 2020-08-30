package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {
    @RequestMapping(value = "/index")
    public String demo(String data){

        return "你好";
    }
    @RequestMapping(value = "/test")
    public String test(String data){

        return "你好aaaaa";
    }
}
