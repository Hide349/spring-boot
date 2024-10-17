package com.aprendendospring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendospring.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
