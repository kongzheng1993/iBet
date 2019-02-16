package com.evil.ibet.common.controller;

import com.alibaba.fastjson.JSON;
import com.evil.ibet.common.service.OrderService;
import com.evil.ibet.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "userOrder", produces = "application/json;charset=UTF-8")
    public @ResponseBody String getUserOrder(String userId) {

        String rtnCode = "999";
        String rtnMessage = "调用接口失败 order/newOrder";
        Map resultMap = new HashMap();

        List<Order> orderList = orderService.getOrderByUserId(userId);
        if (orderList == null || orderList.size() ==0) {
            rtnCode = "1";
            rtnMessage = "您最近五天没有订单";
        } else {
            rtnCode = "0";
            rtnMessage = "成功";
        }
        resultMap.put("rtnCode", rtnCode);
        resultMap.put("rtnMessage", rtnMessage);
        resultMap.put("userOrderList", orderList);
        return JSON.toJSONString(resultMap);
    }

    @RequestMapping(value = "newOrder", produces = "application/json;charset=UTF-8")
    public @ResponseBody String createOrder(String userId, String betSiteId, String betId, String redBalls, String blueBalls, String times) {

        String rtnCode = "999";
        String rtnMessage = "调用接口失败 order/newOrder";
        Map resultMap = new HashMap();

        if (!StringUtils.isEmpty(userId) && !StringUtils.isEmpty(betSiteId)
                && !StringUtils.isEmpty(redBalls) && !StringUtils.isEmpty(blueBalls) && !StringUtils.isEmpty(times)) {
            Order order = new Order(Integer.valueOf(userId), Integer.valueOf(betSiteId), Integer.valueOf(betId), redBalls, blueBalls, Integer.valueOf(times));
            orderService.saveOrder(order);
            rtnCode = "0"; //成功
            rtnMessage = "下单成功";
        } else {
            rtnCode = "1"; //失败 参数不全
            rtnMessage = "创建order失败，由于参数不全";
        }
        resultMap.put("rtnCode", rtnCode);
        resultMap.put("rtnMessage", rtnMessage);
        return JSON.toJSONString(resultMap);
    }

}
