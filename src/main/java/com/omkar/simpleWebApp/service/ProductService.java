package com.omkar.simpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omkar.simpleWebApp.model.Product;
import com.omkar.simpleWebApp.repository.ProductRepo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo repo;
	
//	List<Product> products = new ArrayList<>( Arrays.asList(
//			new Product(101,"Iphone",50000), 
//			new Product(102,"Samsung",20000),
//			new Product(103,"ViVO",15000)));
	
	public List<Product> getProducts(){
		return repo.findAll();
	}

	public Product getProductById(int prodId) {
//		return products.stream()
//				.filter( p -> p.getProdId() == prodId)
//				.findFirst().get();
		return repo.findById(prodId).orElse(new Product());
	}
	
	public void addProduct(Product prod) {
//		products.add(prod);
		repo.save(prod);
	}

	public void updateProduct(Product prod) {
//		products.stream().filter(
//				p -> p.getProdId() == prod.getProdId()
//				).forEach(p ->{
//					p.setPrice(prod.getPrice());
//					p.setProdName(prod.getProdName());
//				});
//		System.out.println(products);
		repo.save(prod); //override or create
	}

	public void deleteProduct(Product prod) {
//		products.removeIf(p->p.getProdId() == prod.getProdId());
//		System.out.println(products);	
		repo.deleteById(prod.getProdId());
	}
}
