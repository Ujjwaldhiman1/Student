package com.example.demo.Services;

import java.util.List;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
//import com.example.demo.model.User;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	 
	
	public  int average(Integer rollNo)
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
		Student s = studentRepository.findByRollNo(rollNo);
		int markArray[] = new int[5];
        int i;
        float sum=0;
        float average,percentage1;
        
		 List <Student> scan = studentRepository.findAll();
        
        for(i=0; i<5; i++){
            markArray[i] = scan.indexOf(i);
            sum = sum + markArray[i];
        }
 
        average = sum/5;
        percentage1 = (sum/500) * 100;
        return (int) average;
        
	}     
	

	
	public  Integer saveOrUpdate(Student student)   
	{ 
		
		  studentRepository.save(student);

		   return student.getRollno();
	}


	public int Average(String subject, int percentage) {
		// TODO Auto-generated method stub
		return 0;
	}

	   	
	
}
