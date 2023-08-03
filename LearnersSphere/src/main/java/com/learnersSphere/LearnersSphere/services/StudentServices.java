package com.learnersSphere.LearnersSphere.services;

import com.learnersSphere.LearnersSphere.entity.Lesson;

public interface StudentServices {

	//returns the specific lesson based on the lesson id entered by the user
	Lesson getLesson(int lessonId);
}
