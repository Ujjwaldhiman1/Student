package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Score;
import com.example.demo.model.Student;
import com.example.demo.repository.ScoreRepository;
import com.example.demo.repository.StudentRepository;

@Service
@Transactional
public class ScoreService {
@Autowired
private ScoreRepository scoreRepository; 
//private StudentRepository studentRepository;

public void updateScore(Score score)
{	scoreRepository.save(score);
	
	
	
	
	}

}
/*Student s= studentRepository.findByRollno(rollno);

List<Score> l = s.getScore();
for(int i=0;i<l.size();i++)
{
	if(l.get(i).getScoreId()==score.getScoreId())
	{
		l.set(i,score);
	}
}
studentRepository.save(s);*/
