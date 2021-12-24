package com.engmed.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.engmed.practice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
