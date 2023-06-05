package com.bsc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bsc.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
