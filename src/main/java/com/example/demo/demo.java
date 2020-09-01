package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {
    @RequestMapping(value = "/index")
    public String demo(String data){

        return "你好jenkins自动化构建";
    }
    @RequestMapping(value = "/test")
    public String test(String data){

        return "  ____    _           _      __                                       ____                       \n" +
                " |  _ \\  | |   __ _  | |_   / _|   ___    _ __   _ __ ___            / ___|   ___    _ __    ___ \n" +
                " | |_) | | |  / _` | | __| | |_   / _ \\  | '__| | '_ ` _ \\   _____  | |      / _ \\  | '__|  / _ \\\n" +
                " |  __/  | | | (_| | | |_  |  _| | (_) | | |    | | | | | | |_____| | |___  | (_) | | |    |  __/\n" +
                " |_|     |_|  \\__,_|  \\__| |_|    \\___/  |_|    |_| |_| |_|          \\____|  \\___/  |_|     \\___|";
    }
}
