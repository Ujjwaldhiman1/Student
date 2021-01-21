package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.StudentService;
//import com.example.demo.Services.UserServices;
import com.example.demo.model.Student;

@RestController
public  class StudentController {
    
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/average")
	public float average(@RequestParam Integer rollno)
	{
	 	System.out.println(rollno);
		return (float) studentService.average(rollno);
	 	

	}

	
	@PostMapping("/Student")  
	public Integer saveUser(@RequestBody Student student)   
	{  
	return studentService.saveOrUpdate(student);  
	   
	}  
}
