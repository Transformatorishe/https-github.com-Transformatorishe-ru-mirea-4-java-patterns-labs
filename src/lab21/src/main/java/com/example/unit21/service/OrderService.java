package com.example.unit21.service;

import com.example.unit21.model.Order;

import java.util.List;

public interface OrderService {
    void create(Order order);

    List<Order> readAll();

    Order read(int id);

    boolean update(Order order, int id);

    boolean delete(int id);
}
