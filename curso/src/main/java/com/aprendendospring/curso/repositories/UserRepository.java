package com.aprendendospring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendospring.curso.entities.User;

public interface UserRepository extends JpaRepository< User, Long>{
	

}
