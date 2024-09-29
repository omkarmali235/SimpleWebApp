package com.omkar.simpleWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omkar.simpleWebApp.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
