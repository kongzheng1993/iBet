package com.evil.ibet.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description:
 * @Project: iBet
 * @Author: kongz
 * @Date: 2010/1/4 0:19
 */
@Controller
public class BeginController {

    @RequestMapping("login.htm")
    public String login(){
        return "login";
    }

    @RequestMapping("register.htm")
    public String register(){
        return "register";
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String doLogin(String username, String password){
        if ("111".equals(username) && "111".equals(password)){
            return "success";
        } else {
            return "failed";
        }
    }
}
