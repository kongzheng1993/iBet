package com.evil.ibet.common.service;

import com.evil.ibet.entity.Order;

import java.util.List;

public interface OrderService {

    void saveOrder(Order order);

    List<Order> getOrderByUserId(String userId);

}
