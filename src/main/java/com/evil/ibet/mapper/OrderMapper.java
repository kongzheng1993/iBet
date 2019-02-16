package com.evil.ibet.mapper;

import com.evil.ibet.entity.Order;

import java.util.List;

public interface OrderMapper {

    void insertOrder(Order order);

    List<Order> selectOrdersByUserId(String userId);


}
