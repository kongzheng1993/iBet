package com.evil.ibet.wechat.controller;

import com.alibaba.fastjson.JSON;
import com.evil.ibet.entity.User;
import com.evil.ibet.util.PropertiesUtil;
import com.evil.ibet.wechat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Project: iBet
 * @Author: kongz
 * @Date: 2019/1/4 16:50
 */
@Controller
@RequestMapping("wechat")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public @ResponseBody Map login(String code) {
        Map returnMap = new HashMap();
        if (!StringUtils.isEmpty(code)) {
            String loginUrl = "https://api.weixin.qq.com/sns/jscode2session?appid=" +
                    PropertiesUtil.getPropertie("AppId") + "&secret=" +
                    PropertiesUtil.getPropertie("AppSecret") + "&js_code=" +
                    code + "&grant_type=authorization_code";
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> responseEntity = restTemplate.exchange(loginUrl, HttpMethod.GET, null, String.class);

            if (responseEntity != null && responseEntity.getStatusCode() == HttpStatus.OK) {
                String sessionData = responseEntity.getBody();
                returnMap = JSON.parseObject(sessionData);
                String wxOpenId = returnMap.get("openid").toString();
                if (!StringUtils.isEmpty(wxOpenId)) {
                    User user = new User(wxOpenId, "","");
                    userService.saveUser(user);
                }
                return returnMap;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

}
