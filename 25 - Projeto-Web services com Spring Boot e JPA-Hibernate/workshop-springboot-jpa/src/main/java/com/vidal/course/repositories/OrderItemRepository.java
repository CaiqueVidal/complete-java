package com.vidal.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vidal.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
