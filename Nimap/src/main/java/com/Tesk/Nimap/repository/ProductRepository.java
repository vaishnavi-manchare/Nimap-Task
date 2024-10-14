package com.Tesk.Nimap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Tesk.Nimap.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
