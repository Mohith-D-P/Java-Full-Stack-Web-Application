package com.learnersSphere.LearnersSphere.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnersSphere.LearnersSphere.entity.Lesson;
import com.learnersSphere.LearnersSphere.repository.LessonRepository;

@Service
public class StudentServicesImplementation  implements StudentServices{

	@Autowired
	LessonRepository lessonRepo;
	@Override
	public Lesson getLesson(int lessonId) {
		
		return lessonRepo.findById(lessonId).get();
	}

}
