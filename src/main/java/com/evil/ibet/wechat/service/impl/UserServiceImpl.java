package com.evil.ibet.wechat.service.impl;

import com.evil.ibet.entity.User;
import com.evil.ibet.mapper.UserMapper;
import com.evil.ibet.wechat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void saveUser(User user) {
        userMapper.insertUser(user);
    }
}
