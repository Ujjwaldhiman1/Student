package com.example.demo.Services;

import java.util.List;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Score;
import com.example.demo.model.Student;
//import com.example.demo.model.User;
import com.example.demo.repository.StudentRepository;

@Service
@Transactional
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	 
	
	public  float average(Integer rollno)
	{

		/*  List <Student> studentlist = studentRepository.findAll();
		      
		  for(Student a:studentlist)
		  {
		        for(i=0; i<sizeof(percentage); i++)
		        {
                   percentage[i]=percentage[i]+percentage[i+1];
			return average= ((sum of all percentages ) /( total *100)*100));

		  }
		  */
		Student s = studentRepository.findByRollno(rollno);
		System.out.println(s);
		List<Score> scorelist = s.getScore();
		
		 float sum = 0;
		 float average;
		  for(Score a:scorelist)
		  {
			  System.out.println(a.getPercentage());
			  sum = sum + a.getPercentage();
			  System.out.println(sum);


		  }
		  
		     System.out.println(sum);
		     System.out.println((sum/(scorelist.size()*100)));
			 average= ((sum) /(scorelist.size() *100)*100);
			  System.out.println(average);

          return average;

	}     
	

	
	public  Integer saveOrUpdate(Student student)   
	{ 
		
		  studentRepository.save(student);

		   return student.getRollno();
	}


/*	public int Average(String subject, int percentage) {
		// TODO Auto-generated method stub
		return 0;
	}
*/
	   	
	
}
