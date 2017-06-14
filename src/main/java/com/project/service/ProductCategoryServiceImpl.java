package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.ProductCategory;
import com.project.repository.ProductCategoryRepository;

@Service("productCategoryService")
public class ProductCategoryServiceImpl implements ProductCategoryService {
	@Autowired
	private ProductCategoryRepository productCategoryRepo;

	@Override
	public ProductCategory findCategoryByName(String name) {

		return productCategoryRepo.findCategoryByName(name);
	}

	@Override
	public ProductCategory findCategoryById(Long id) {
		return productCategoryRepo.findOne(id);
	}

	@Override
	public List<ProductCategory> getAllCategories() {

		return productCategoryRepo.findAll();
	}

}
