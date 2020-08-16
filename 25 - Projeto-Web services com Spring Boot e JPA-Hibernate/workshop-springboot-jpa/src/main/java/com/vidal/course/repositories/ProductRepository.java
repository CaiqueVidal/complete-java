package com.vidal.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vidal.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
