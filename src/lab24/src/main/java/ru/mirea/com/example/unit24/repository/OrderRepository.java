package ru.mirea.com.example.unit24.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mirea.com.example.unit24.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
