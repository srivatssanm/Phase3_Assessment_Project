package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Questions;
import com.project.entity.User;
import com.project.repo.UserRepo;


@Service

public class UserService {
	@Autowired
	private UserRepo userRepository;
	
	public Boolean verifyUser(String email, String password)
	{
		List<User> users = userRepository.findAll();
		
		for(User user : users)
		{
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) 
			{ 
				return true;
			}
		}
		return false;
	}
	
	//add User
	public User addUser(User u) {
		return userRepository.save(u);
	}
	
	//List user Method
	public List<User> getAllUser(){
		return userRepository.findAll();
	}
	
	//get user by id
	public User getUserById(int id) {
		if(userRepository.findById(id).isPresent()) 
			return userRepository.findById(id).get();
		else 
			return null;
		
	}
	

}
