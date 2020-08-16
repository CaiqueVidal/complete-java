package com.vidal.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vidal.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
