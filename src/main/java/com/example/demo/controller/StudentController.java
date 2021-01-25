package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	{  System.out.println(student);
	return studentService.saveOrUpdate(student);  
	   
	}
	
	@GetMapping("/getStudents")
	public List<Student> getStudents(){
	List<Student> l=studentService.getAllStudents();
	
	for(Student s:l) 
	{System.out.println(s);}
	return l;
	}
	
	
	@GetMapping("/getstudentById")
	public Student getStudentById(@RequestParam int rollno)
	{
		return studentService.getStudentById(rollno);
	}
	
	@DeleteMapping("/deleteByName")
	public int deleteByName(@RequestParam String name )
	{
		return studentService.deleteStudent(name);
	}
	
	
	//@PutMapping("/updateScore")
	//public void updateScore(@RequestBody){
		
	//}
}

