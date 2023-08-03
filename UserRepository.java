package com.learnersSphere.LearnersSphere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnersSphere.LearnersSphere.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
	
	//defining a signature of the method
	boolean existsByEmail(String email);
	
	Users getByEmail(String email);
}
