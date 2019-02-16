package com.evil.ibet.common.service.impl;

import com.evil.ibet.entity.Order;
import com.evil.ibet.mapper.OrderMapper;
import com.evil.ibet.common.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public void saveOrder(Order order) {
        orderMapper.insertOrder(order);
    }

    public List<Order> getOrderByUserId(String userId) {
        return orderMapper.selectOrdersByUserId(userId);
    }
}
