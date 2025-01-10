package com.prodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodapp.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
