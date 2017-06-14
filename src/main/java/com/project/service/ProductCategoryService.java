package com.project.service;

import java.util.List;

import com.project.model.ProductCategory;

public interface ProductCategoryService {
	public ProductCategory findCategoryByName(String name);

	public ProductCategory findCategoryById(Long id);

	public List<ProductCategory> getAllCategories();

}
