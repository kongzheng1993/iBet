package com.evil.ibet.entity;

public class User {

    private int id;             //用户id
    private String wxOpenId;    //微信openId
    private String userName;    //用户真实姓名
    private String wxNickName;  //用户微信昵称

    public User(String wxOpenId, String userName, String wxNickName) {
        this.wxOpenId = wxOpenId;
        this.userName = userName;
        this.wxNickName = wxNickName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getWxNickName() {
        return wxNickName;
    }

    public void setWxNickName(String wxNickName) {
        this.wxNickName = wxNickName;
    }
}
