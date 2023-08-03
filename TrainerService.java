package com.learnersSphere.LearnersSphere.services;

import java.util.List;

import com.learnersSphere.LearnersSphere.entity.Course;
import com.learnersSphere.LearnersSphere.entity.Lesson;

public interface TrainerService {
	public String addCourse(Course course);

	public String addLesson(Lesson lesson);

	public Course getCourse(int courseId);
	
	public List<Course> courseList();
}
