package com.learnersSphere.LearnersSphere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnersSphere.LearnersSphere.entity.Comments;

public interface CommentRepository extends JpaRepository<Comments, Integer>{

}
