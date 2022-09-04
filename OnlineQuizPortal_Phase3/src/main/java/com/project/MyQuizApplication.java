package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.project")
public class MyQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyQuizApplication.class, args);
	}

}
