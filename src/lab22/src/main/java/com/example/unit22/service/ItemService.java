package com.example.unit22.service;


import com.example.unit22.model.Item;

import java.util.List;

public interface ItemService {
    void create(Item item);

    List<Item> readAll();

    Item read(int id);

    boolean update(Item item, int id);

    boolean delete(int id);
}
