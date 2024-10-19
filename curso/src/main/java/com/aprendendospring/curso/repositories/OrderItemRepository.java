package com.aprendendospring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendospring.curso.entities.OrderItem;
import com.aprendendospring.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository< OrderItem, OrderItemPK>{
	

}
