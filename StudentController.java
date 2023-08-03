package com.learnersSphere.LearnersSphere.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learnersSphere.LearnersSphere.entity.Lesson;
import com.learnersSphere.LearnersSphere.services.StudentServices;

@Controller
public class StudentController {

	
	@Autowired
	StudentServices services;
	@PostMapping("/goToLesson")
	public String myLesson(@RequestParam("lessonId") int lessonId,
			Model model)
	{
		Lesson lesson=services.getLesson(lessonId);
		model.addAttribute("lesson",lesson);
		System.out.println("lesson");
		return "myLesson";
	}
}
