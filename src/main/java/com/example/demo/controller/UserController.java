package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired; 
  
import org.springframework.web.bind.annotation.GetMapping;    
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;


import com.example.demo.Services.UserServices;
import com.example.demo.model.*;
import com.example.demo.repository.UserRepository; 
import org.springframework.web.bind.annotation.RequestParam;

@RestController
//@RequestMapping("/rest/auth")
public class UserController {
	 
	@Autowired  
	UserServices UserService;
	@Autowired
	UserRepository userRepository;
	//creating a get mapping that retrieves all the user detail from the database   
	
	@GetMapping("/Map")
	private List<AddressDto> findInfo()
	{
		return UserService.findAllInfo();
	}
	
	
	
/*	
    
	
	public User registerUser(@RequestBody User user) throws Exception
	{
		String tempEmailId = user.getEmail();
		
		if(tempEmailId !=null && !"".equals(tempEmailId))
		{
			User userobj = UserService.fetchUserByEmailId(tempEmailId);
			if(userobj != null)
			{
				throw new Exception("user with "+"tempEmailId"+" is already exit");
			}
			 User userObj = null;
			 userObj = UserService.saveUser(user);
			 return userObj;
		}
	}
	
	*/
	
	@GetMapping("/login")
	public String loginUser(@RequestParam String email,String password) throws Throwable
	{
		
		return UserService.login(email,password);
	}
	
	/*
	@GetMapping("/getMsg")
	public String getMsg()
	{
		return "spring security msg";
	}
	/*
	
	@GetMapping("/User")  
	private List <User>getAllUser()   
	{  
	return UserService.getAllUser();  
	} 
	*/ 
	//creating a get mapping that retrieves the detail of a specific user 
	@GetMapping("/User/{userid}")  
	private User getUser(@PathVariable("userid") int userid)   
	{ 
	return UserService.getUserById(userid);  
	} 
	//creating a delete mapping that deletes a specified user  
	@DeleteMapping("/User/{userid}")  
	private void deleteBook(@PathVariable("userid") int userid)   
	{  
	UserService.delete(userid);  
	}  
	//creating post mapping that post the user detail in the database  
	@PostMapping("/User")  
	private int saveUser(@RequestBody AddressDto addressdto)   
	{  
	UserService.saveOrUpdate(addressdto);  //user=addressdto
	return 0;   //user.=addressdto
	}  
	//creating put mapping that updates the user detail   
	@PutMapping("/User/{userid}")  
	private AddressDto update(@RequestBody AddressDto  addressdto,@PathVariable("userid") int userid)   
	{  
	UserService.saveOrUpdate(addressdto);  
	return addressdto;  
	}  
	}  

