package com.project.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Quiz;
import com.project.repo.CreateQuizRepo;


@Service
public class CreateQuizService {
	
	@Autowired
	private CreateQuizRepo repo;
	
	//add method or CREATE RECORD
	public Quiz addUser(Quiz u) {
		return repo.save(u);
	}
	
	
	//List user Method
	public List<Quiz> getAllUser(){
		return repo.findAll();
	}
	
	//get user by id
	public Quiz getUserById(int id) {
		if(repo.findById(id).isPresent()) 
			return repo.findById(id).get();
		else 
			return null;
	
	}
	}