package com.project.service;

import java.util.List;

import com.project.model.Product;

public interface ProductService {
	public Product getProductById(long id);

	public Product getProductByName(String name);


	public List<Product> getAllProducts();
}
