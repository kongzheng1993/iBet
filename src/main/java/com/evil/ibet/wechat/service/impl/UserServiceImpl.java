package com.evil.ibet.wechat.service.impl;

import com.evil.ibet.entity.BetSite;
import com.evil.ibet.entity.User;
import com.evil.ibet.mapper.UserMapper;
import com.evil.ibet.wechat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void saveUser(User user) {
        userMapper.insertUser(user);
    }

    public User getUserByWxOpenId(String wxOpenId) {
        return userMapper.selectUserByWxOpenId(wxOpenId);
    }

    public User getUserById(String wxOpenId) {
        return userMapper.selectUserById(wxOpenId);
    }

    public int updateUserById(User user) {
        return userMapper.updateUserById(user);
    }

    public List<BetSite> getUserBetSitesByUserId(String userId) {
        return userMapper.selectUserBetSitesByUserId(userId);
    }

}
