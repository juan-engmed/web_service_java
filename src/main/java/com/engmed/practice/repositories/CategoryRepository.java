package com.engmed.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.engmed.practice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
