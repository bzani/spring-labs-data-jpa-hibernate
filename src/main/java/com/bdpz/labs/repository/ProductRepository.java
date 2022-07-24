package com.bdpz.labs.repository;

import org.springframework.stereotype.Repository;

import com.bdpz.labs.model.Product;

@Repository
public interface ProductRepository extends CustomRepository<Product, Long> {
	
}
