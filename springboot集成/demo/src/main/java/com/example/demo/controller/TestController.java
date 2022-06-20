package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class TestController {
    @RequestMapping("/test")
    public int returnNum(){
        int i=1;
        int j;
        i=i/0;
        return i;
    }
}
