package com.aprendendospring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendospring.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
