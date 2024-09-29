package com.omkar.simpleWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omkar.simpleWebApp.model.Product;
import com.omkar.simpleWebApp.service.ProductService;

import ch.qos.logback.core.status.Status;


@RestController
public class ProductController {

	@Autowired
	ProductService service;
	
//	@RequestMapping("/products")
	@GetMapping("/products")
	public List<Product> getProducts() {
		return service.getProducts();
	}
	
//	@RequestMapping("/products/{prodId}")
	@GetMapping("/products/{prodId}")
	public Product getProductById(@PathVariable int prodId) {
		return service.getProductById(prodId);
	}
	
//	@RequestMapping("/products")
	@PostMapping("/products")
	public String addProduct(@RequestBody Product prod) {
		System.out.println(prod);
		service.addProduct(prod);
		return "Data Added SuccessFully";
	}
	
	@PutMapping("/products")
	public void updateProduct(@RequestBody Product prod) {
		service.updateProduct(prod);
	}
	
	@DeleteMapping("/products")
	public ResponseEntity<String> deleteProduct(@RequestBody Product prod) {
		System.out.println(prod);
		service.deleteProduct(prod);
		return new ResponseEntity<String>(HttpStatus.GONE);
	}
}
