package com.example.demo.repository;
//import org.springframework.data.repository.CrudRepository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.User;  


public interface UserRepository extends JpaRepository<User, Integer>  
	{
     // public User findByEmailId(String emailId,String password);
	//public User findByEmailIdAndPassword(String email,String password);
	public User findByEmailAndPassword(String email,String password);
	 
	}  

