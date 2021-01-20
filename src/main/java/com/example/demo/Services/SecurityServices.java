package com.example.demo.Services;


import com.example.demo.model.*;

import java.util.ArrayList;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.SecurityRepository;
import com.example.demo.repository.UserRepository;

 
@Service 
public class SecurityServices {
	@Autowired  
	SecurityRepository securityRepository; 
	@Autowired
	UserRepository userRepository;
	//@Autowired
//	UserServices userServices;
	//getting all  record by using the method findaAll() of CrudRepository  
	public List<Security> getAllSecurity()   
	{  
	List<Security> security = new ArrayList<Security>();  
	securityRepository.findAll().forEach(security1 -> security.add(security1));
	return security;
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public Security getSecurityById(int id)
	{  
		if(securityRepository.findById(id).isPresent())
			return securityRepository.findById(id).get();
		else return  null;
	// return securityRepository.findById(id).get();  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
	securityRepository.deleteById(id);
	} 
	//post
	public Security saveOrUpdate(Security security)
	{ 
		
		
		
	
		/* Security newSecurity = new Security();
	       newSecurity.setGroupName(security.getGroupName());
	        newSecurity.setDelete((security.getDelete()));
	        newSecurity.setEnable((security.getEnable()));
	        newSecurity.getUser()
	               .addAll(security
	                      .getUser()
	                       .stream()
	                       .map(v -> {
	                            User vv = userServices.getUserById(v.getUserid());
	                            vv.setSecurity(Arrays.asList(newSecurity));
	                           return vv;
	                        }).collect(Collectors.toList()));
	    //    List <User> user = security.getAllUser(); */
		return securityRepository.save(security);
	} 

	//updating a record  
	public void update(Security security,int id)
	{  
	securityRepository.save(security);
	}  

}