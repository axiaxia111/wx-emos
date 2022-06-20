package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.Mapping;

@Mapper
public interface UserDao {

    public void insertID();
    public int  searchById();

}
