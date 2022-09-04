package com.project.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Scoreboard;
import com.project.repo.ScoreboardRepo;


@Service
public class ScoreboardService {
	
	@Autowired
	private ScoreboardRepo repo;
	
	
	//List user Method
	public List<Scoreboard> getAllUser(){
		return repo.findAll();
	}
	
	//get user by id
	public Scoreboard getUserById(int id) {
		if(repo.findById(id).isPresent()) 
			return repo.findById(id).get();
		else 
			return null;
		
	}
}