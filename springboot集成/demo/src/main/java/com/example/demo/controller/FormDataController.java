package com.example.demo.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class FormDataController {
    @RequestMapping("/form")
    public String formHandler(String myname){
        System.out.println(myname);
        return myname;
    }

}
