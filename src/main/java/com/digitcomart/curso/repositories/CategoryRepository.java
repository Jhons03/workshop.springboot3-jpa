package com.digitcomart.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitcomart.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
