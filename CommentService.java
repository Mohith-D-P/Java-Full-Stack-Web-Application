package com.learnersSphere.LearnersSphere.services;

import java.util.List;

import com.learnersSphere.LearnersSphere.entity.Comments;

public interface CommentService {

	List<Comments> commentList();

	String addComment(Comments comment);
}
