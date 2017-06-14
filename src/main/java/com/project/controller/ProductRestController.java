package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Product;
import com.project.service.ProductService;

@RestController
public class ProductRestController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
	public Product getProductById(@PathVariable("id") long id) {
		return productService.getProductById(id);
	}
}
