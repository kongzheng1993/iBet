package com.evil.ibet.wechat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Project: iBet
 * @Author: kongz
 * @Date: 2019/1/4 16:50
 */
@Controller("wechat")
public class LoginController {

    @RequestMapping("login")
    @ResponseBody
    public Map login(String code) {
        Map loginResMap = new HashMap();
        if (code.equals("12345")) {
            loginResMap.put("openId", "11111");
            loginResMap.put("sessionKey", "22222");
            loginResMap.put("unionId", "33333");
        }
        return loginResMap;
    }

}
