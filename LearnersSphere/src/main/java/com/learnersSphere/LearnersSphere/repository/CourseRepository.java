package com.learnersSphere.LearnersSphere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnersSphere.LearnersSphere.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
