package com.service.impl;

import com.dao.UserDao;
import com.service.UserService;

public class UserServiceImpl implements UserService {


    private UserDao userDao;

    @Override
    public void findall() {
        userDao.findall();
    }
}
