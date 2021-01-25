package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.ScoreService;
import com.example.demo.model.Score;

@RestController
public class ScoreController {
	
	@Autowired
	private ScoreService scoreService;
	
	@PutMapping("/updateScore")
	public void updateScore(@RequestBody Score score)
	{
		scoreService.updateScore(score);
	}
}
