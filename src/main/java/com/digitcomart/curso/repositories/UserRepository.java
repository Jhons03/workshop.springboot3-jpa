package com.digitcomart.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitcomart.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
