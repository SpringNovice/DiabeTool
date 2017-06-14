package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Product;
import com.project.repository.ProductRepository;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product getProductById(long id) {
		return productRepository.findOne(id);
	}

	@Override
	public Product getProductByName(String name) {
		return productRepository.findProductByName(name);
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

}
