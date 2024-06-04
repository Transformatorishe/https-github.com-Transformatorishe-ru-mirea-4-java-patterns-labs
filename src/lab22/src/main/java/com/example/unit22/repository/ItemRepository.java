package com.example.unit22.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.unit22.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
