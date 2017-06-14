package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Product;

@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Long> {
	Product findProductByName(String name);

}
