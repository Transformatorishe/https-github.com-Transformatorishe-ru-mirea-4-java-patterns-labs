package com.example.unit23.service;

import com.example.unit23.model.Order;
import com.example.unit23.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @Override
    public void create(Order order) {
        log.info("Create order");
        orderRepository.save(order);
    }

    @Override
    public List<Order> readAll() {
        log.info("Read all orders");
        return orderRepository.findAll();
    }

    @Override
    public Order read(int id) {
        log.info("Read order " + id);
        return orderRepository.getReferenceById(id);
    }

    @Override
    public boolean update(Order order, int id) {
        log.info("Update order " + id);
        if (orderRepository.existsById(id)) {
            order.setId(id);
            orderRepository.save(order);
            return  true;
        }

        return false;
    }

    @Override
    public boolean delete(int id) {
        log.info("Delete order " + id);
        if (orderRepository.existsById(id)) {
            orderRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
