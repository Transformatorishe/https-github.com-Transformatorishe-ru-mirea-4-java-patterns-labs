package com.example.unit21.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.unit21.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
