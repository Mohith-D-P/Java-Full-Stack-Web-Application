package com.learnersSphere.LearnersSphere.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnersSphere.LearnersSphere.entity.Course;
import com.learnersSphere.LearnersSphere.entity.Lesson;
import com.learnersSphere.LearnersSphere.repository.CourseRepository;
import com.learnersSphere.LearnersSphere.repository.LessonRepository;
@Service
public class TrainerServiceImplementation implements TrainerService{

	@Autowired
	CourseRepository courseRepo;

	@Autowired
	LessonRepository lessonRepo;

	@Override
	public String addCourse(Course course) {

		courseRepo.save(course);
		return "Course added successfully";
	}
	@Override
	public String addLesson(Lesson lesson) {
		lessonRepo.save(lesson);
		return "lesson added successfully !!";
	}
	@Override
	public Course getCourse(int courseId) {
		return courseRepo.findById(courseId).get();
	}
	@Override
	public List<Course> courseList() {
		return courseRepo.findAll();
	}

}
