package com.learnersSphere.LearnersSphere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnersSphere.LearnersSphere.entity.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {

}
