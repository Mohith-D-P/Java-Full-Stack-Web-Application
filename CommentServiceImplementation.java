package com.learnersSphere.LearnersSphere.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnersSphere.LearnersSphere.entity.Comments;
import com.learnersSphere.LearnersSphere.repository.CommentRepository;

@Service
public class CommentServiceImplementation implements CommentService{

	@Autowired
	CommentRepository commentRepo;
	@Override
	public List<Comments> commentList() {
		// TODO Auto-generated method stub
		return commentRepo.findAll();
	}
	@Override
	public String addComment(Comments comment) {
		commentRepo.save(comment);
		return "comment added";
	}

}
