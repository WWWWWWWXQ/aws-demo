package com.example.awsdemo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
