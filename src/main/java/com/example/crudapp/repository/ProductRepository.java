package com.example.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudapp.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByName(String name);

}
