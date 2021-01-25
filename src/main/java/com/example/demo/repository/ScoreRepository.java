package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Score;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Integer>{

	public Score findByScoreId(Integer integer);

}
