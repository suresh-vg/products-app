package com.example.ProductsAppdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProductsAppdemo.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
