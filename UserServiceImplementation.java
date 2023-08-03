package com.learnersSphere.LearnersSphere.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnersSphere.LearnersSphere.entity.Users;
import com.learnersSphere.LearnersSphere.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

	// to talk with the DataBase, had to use Repository
	//creating a reference for User Repository
	@Autowired
	UserRepository repo;

	@Override
	public String addUser(Users user) {
		repo.save(user);
		return "Student Added Successfully";
	}

	@Override
	public boolean checkEmail(String email) {
		return	repo.existsByEmail(email);
	}

	@Override
	public boolean validate(String email, String password) {
		if(repo.existsByEmail(email))
		{
			Users u=repo.getByEmail(email);
			String dbPassword=u.getPassword();
			if(password.equals(dbPassword))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}

	}

	//will give role of the particular user
	@Override
	public String getUserRole(String email) {
		Users u=repo.getByEmail(email);
		return u.getRole();
	}



}
