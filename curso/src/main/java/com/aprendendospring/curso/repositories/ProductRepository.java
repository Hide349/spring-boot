package com.aprendendospring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendospring.curso.entities.Product;

public interface ProductRepository extends JpaRepository< Product, Long>{
	

}
