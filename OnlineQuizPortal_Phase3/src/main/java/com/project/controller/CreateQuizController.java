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

import com.project.entity.Quiz;
import com.project.service.CreateQuizService;


@RestController
@RequestMapping("/onlineQuiz/QuizCreation")
public class CreateQuizController {
	
	@Autowired
	private CreateQuizService service;
	
	///create new record
	@PostMapping("/addingNewQuiz")
	public ResponseEntity<Quiz> addUser(@RequestBody Quiz u){
		Quiz user= service.addUser(u);
		if(user!=null)  
			return new ResponseEntity<Quiz>(user,HttpStatus.CREATED);
		else
			return new ResponseEntity<Quiz>(user, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//List of Users Or RETRIVE DATA
	@GetMapping("/DisplayAllQuizzes")
	public  List<Quiz> getAllUser(){
		return service.getAllUser();
	}
	
	//get user by id
	@GetMapping("/{id}")
	public ResponseEntity<Quiz> getUserById(@PathVariable int id){
		  Quiz user= service.getUserById(id);
		  
		  if(user!=null)
			  return new ResponseEntity<Quiz>(user,HttpStatus.FOUND);
		  else
			  return new  ResponseEntity<Quiz>(user,HttpStatus.NOT_FOUND);
	}
}