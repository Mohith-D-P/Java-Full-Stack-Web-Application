package com.learnersSphere.LearnersSphere.services;

import com.learnersSphere.LearnersSphere.entity.Users;

public interface UserService {
	//adds new user to db
	String addUser(Users user);

	//checks email is already present in db or not
	boolean checkEmail(String email);

	//validates user credentials
	boolean validate(String email, String password);

	//get users's role by providing email
	String getUserRole(String email);

}
