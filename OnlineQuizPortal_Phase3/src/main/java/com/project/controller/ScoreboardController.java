package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Scoreboard;
import com.project.service.ScoreboardService;



@RestController
@RequestMapping("/onlineQuiz/RankBoard")
public class ScoreboardController {
	
	@Autowired
	private ScoreboardService service;
	
	//List of Users 
	@GetMapping("/displayall")
	public  List<Scoreboard> getAllUser(){
		return service.getAllUser();
	}
	
	//get user score by id
	@GetMapping("/{id}")
	public ResponseEntity<Scoreboard> getUserById(@PathVariable int id){
		 Scoreboard user= service.getUserById(id);
		  
		  if(user!=null)
			  return new ResponseEntity<Scoreboard >(user,HttpStatus.FOUND);
		  else
			  return new  ResponseEntity<Scoreboard >(user,HttpStatus.NOT_FOUND);
	}
}
