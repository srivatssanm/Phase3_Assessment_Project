package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.QuizCompetition;


@Repository
public interface QuizRepo extends JpaRepository<QuizCompetition, Integer> {

}