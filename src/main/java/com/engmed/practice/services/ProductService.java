package com.engmed.practice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engmed.practice.entities.Product;
import com.engmed.practice.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	
	public List<Product> findAll(){
		
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
