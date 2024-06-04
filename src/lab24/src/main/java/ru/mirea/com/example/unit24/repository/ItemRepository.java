package ru.mirea.com.example.unit24.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mirea.com.example.unit24.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
