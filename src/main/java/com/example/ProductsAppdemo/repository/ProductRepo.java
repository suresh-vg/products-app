package com.example.ProductsAppdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ProductsAppdemo.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}
