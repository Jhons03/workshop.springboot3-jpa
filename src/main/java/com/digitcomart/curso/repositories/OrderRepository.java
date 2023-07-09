package com.digitcomart.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitcomart.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
