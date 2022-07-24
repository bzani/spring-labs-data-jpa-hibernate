package com.bdpz.labs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdpz.labs.model.Product;
import com.bdpz.labs.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAll() {
		return productRepository.findAll();
	}

	public void save(Product product) {
		productRepository.saveAndNotify(product);
	}

	public void update(Long id, Product product) {
		Product entity = productRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found " + id));
		entity.setName(product.getName());
		productRepository.saveAndNotify(entity);
	}

}