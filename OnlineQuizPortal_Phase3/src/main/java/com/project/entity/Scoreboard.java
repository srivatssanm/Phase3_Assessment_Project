package com.project.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Scoreboard {
	@Id
	@Column(name="position")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int position;
	private String user;
	private String score;
	
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public Scoreboard(int position, String user, String score) {
		super();
		this.position = position;
		this.user = user;
		this.score = score;
	}
	
	
	public Scoreboard() {
		
	}
	
	

}
