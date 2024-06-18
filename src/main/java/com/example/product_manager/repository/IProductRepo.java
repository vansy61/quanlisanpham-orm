package com.example.product_manager.repository;

import com.example.product_manager.model.Product;

import java.util.List;

public interface IProductRepo {
    List<Product> findAll();

    void save(Product customer);

    Product findById(int id);

    void update(Product product);

    void remove(int id);
}
