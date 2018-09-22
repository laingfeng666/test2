package com.dao.impl;

import com.dao.UserDao;
import com.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SingleColumnRowMapper;

import javax.xml.ws.soap.Addressing;
import java.util.LinkedHashSet;
import java.util.List;

public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void findall() {
        String sql="select * from user";
        List<User> list= jdbcTemplate.query(sql,new BeanPropertyRowMapper<User>(User.class));
        System.out.println(list);


    }
}
