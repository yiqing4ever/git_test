package com.example.boot.demo_springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("index")
    public String index(){
        p();
        p();
        return "hello world!";
    }

    public void p(){
        System.out.println("-----test----");
    }
}
