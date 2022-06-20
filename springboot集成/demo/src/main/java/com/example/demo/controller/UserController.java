package com.example.demo.controller;

import com.example.demo.common.R;
import com.example.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("/users")
@ResponseBody
public class UserController {

    @Autowired
    UserDao userDao;
    @GetMapping
    public R insertId(){
        userDao.insertID();
        return R.OK();
    }

    @PostMapping
    public R returnInfo(){
        HashMap<String,Object> map=new HashMap<>();
        map.put("data",userDao.searchById());
        return R.OK(map);
//        return userDao.searchById();
    }

}
