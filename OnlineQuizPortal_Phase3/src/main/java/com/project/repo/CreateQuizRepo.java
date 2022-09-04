package com.project.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.Quiz;


@Repository
public interface CreateQuizRepo extends JpaRepository<Quiz, Integer> {

}
