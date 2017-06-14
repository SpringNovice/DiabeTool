package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.ProductCategory;

@Repository("productCategoryRepository")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
	ProductCategory findCategoryByName(String name);
}
