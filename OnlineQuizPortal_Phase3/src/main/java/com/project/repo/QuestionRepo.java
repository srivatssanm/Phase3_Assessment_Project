package com.project.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.Questions;


@Repository
public interface QuestionRepo extends JpaRepository<Questions, Integer> {

}