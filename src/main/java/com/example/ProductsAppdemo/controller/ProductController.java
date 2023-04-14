package com.example.ProductsAppdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProductsAppdemo.entity.Product;
import com.example.ProductsAppdemo.repository.ProductRepo;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepo productrepo;
	
	public void saveproduct(Product product)
	{
		System.out.println(product);
	}

}
