package com.project.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.Scoreboard;


@Repository
public interface ScoreboardRepo extends JpaRepository<Scoreboard, Integer> {

}