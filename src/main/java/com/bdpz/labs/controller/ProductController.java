package com.bdpz.labs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bdpz.labs.model.Product;
import com.bdpz.labs.service.ProductService;

@Controller
@RequestMapping("/api/v1/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok(productService.getAll());
	}

	@PostMapping
	public ResponseEntity<?> save(@RequestBody Product product) {
		productService.save(product);
		return ResponseEntity.ok().build();
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> save(@PathVariable("id") Long id, @RequestBody Product product) {
		productService.update(id, product);
		return ResponseEntity.ok().build();
	}

}
