package com.evil.ibet.wechat.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DemoController {

    @RequestMapping(value = "test", produces = {"application/json;charset=UTF-8"})
    public @ResponseBody String test(){
        Map map = new HashMap();
        map.put("1","a");
        map.put("2","b");
        map.put("3","你好");
        return JSON.toJSONString(map);
    }

}
