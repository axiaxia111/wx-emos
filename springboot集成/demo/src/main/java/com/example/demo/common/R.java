package com.example.demo.common;


import org.apache.http.HttpStatus;

import java.util.HashMap;

public class R extends HashMap{
    public R(){
        put("code", HttpStatus.SC_OK);
        put("message","success");
    }
    public R put(String key,Object value){
        super.put(key,value);
        return this;
    }
    public static R OK(){
        return new R();
    }
    public static R OK(String mes){
        R r=new R();
        r.put("message",mes);
        return  r;
    }
    public static R OK(HashMap<String,Object> map){
        R r=new R();
        r.putAll(map);
        return  r;
    }

}
