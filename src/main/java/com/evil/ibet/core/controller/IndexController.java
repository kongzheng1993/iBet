package com.evil.ibet.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: 登陆controller
 * @Project: demandManagementSystem
 * @Author: kongz
 * @Date: 2019/1/4 0:50
 */
@Controller
public class IndexController {

    @RequestMapping("/index.htm")
    public String index(){
        return "../../index";
    }
}
