package com.example.demo.Services; 
 

import java.util.ArrayList;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


import com.example.demo.model.Address;
// import com.example.demo.model.Address;
import com.example.demo.model.AddressDto;
import com.example.demo.model.User;
import com.example.demo.repository.AddressRepository;
import com.example.demo.repository.SecurityRepository;
import com.example.demo.repository.UserRepository;
//import com.google.common.base.Optional; 


	//defining the business logic  
	@Service  
	public class UserServices   
	{  
	@Autowired  
	UserRepository userRepository;
	@Autowired
	AddressRepository addressRepository;
	@Autowired
	SecurityRepository securityRepository; 
	//SecurityServices securityServices;
	
	//getting all User record by using the method findaAll() of CrudRepository  	

/*	public void saveUser(User user)
	{
		userRepository.save(user);
	}
	*/
	
	
	
	@Autowired
    private JavaMailSender javaMailSender;

	public void sendEmail() {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("ashish2398negi@gmail.com");

        msg.setSubject("Testing from Spring Boot");
        msg.setText("Hello World \n Spring Boot Email");

        javaMailSender.send(msg);

    }
	
	public List< AddressDto> findAllInfo()
	{
		//AddressDto addressDto = new AddressDto();
		  List <User> userlist = userRepository.findAll();
		  List <AddressDto> addressdtolist = new ArrayList<>();
		  for(User a:userlist)
		  {
			  AddressDto addressDto = new AddressDto();
			  
		Address address1=addressRepository.findByUser(a);
		    // address1.getId();        SimpleMailMessage msg = new SimpleMailMessage();

			  //System.out.println(a.getUserid());
		addressDto.setAddress1(address1.getAddress1());
		addressDto.setAddress2(address1.getAddress2());
		addressDto.setCity(address1.getCity());
		addressDto.setStreet(address1.getStreet());
		addressDto.setCountry(address1.getCountry());
		addressDto.setZipcode(address1.getZipcode());
		
		
		addressDto.setFirstname(a.getFirstname());
		addressDto.setLastname(a.getLastname());
		addressDto.setPassword(a.getPassword());
		addressDto.setEmail(a.getEmail());
		 addressdtolist.add(addressDto);
		  }
		//  System.out.println("hello");
		  //   userRepository.findAll().forEach(user1 -> addressRepository.G
		   //  findById(id));

		//  List <Address> address = new ArrayList<Address>();
		  // addressRepository.findAll().forEach(address1 -> address.add(address1));
		 return  addressdtolist;
	}
	
	public  String login(String email,String password) throws Exception
	{
	 User user = userRepository.findByEmailAndPassword(email,password);
	 
	 if(user!=null)
	 {
	   throw new Exception ("Could not find with this email and password");
	 }
	  return "Login succesfully";
	}
	
	
	public List<User> getAllUser()   
	{  
	List<User> user = new ArrayList<User>();
	userRepository.findAll().forEach(user1 -> user.add(user1));
	//forEach(user1 -> user.add(user1));
	return user;  
	}
	
	//getting a specific record by using the method findById() of CrudRepository  
	public  User getUserById(int id)   
	{ 
		if(userRepository.findById(id).isPresent())
			return userRepository.findById(id).get();
		else return  null;
	// return userRepository.findById(id).get();  
	}
	/*
	public Address getAddressById(Long id)
	{
		if(addressRepository.findById(id).isPresent())
		   return addressRepository.findById(id).get();
		else return null; 
		return addressRepository.findById(id).get();
	}
	*/
	
 	public AddressDto saveOrUpdate(AddressDto addressdto)   
	{ 
		
		User user = new User();
		 // user.setUserid(addressdto.getUserid());
		  user.setFirstname(addressdto.getFirstname());
		  user.setLastname(addressdto.getLastname());
		  user.setEmail(addressdto.getEmail());
		  user.setPassword(addressdto.getPassword());
		/*   SimpleMailMessage msg = new SimpleMailMessage();
	         msg.setTo(user.getEmail());
	        msg.setSubject("Testing from Spring Boot");
	        msg.setText("The User has been created Successfully");

	        msg.setText("UserFirstname "+user.getFirstname()+" ");
	        msg.setText("Email "+user.getEmail()+" ");
	  
	        javaMailSender.send(msg); */

		userRepository.save(user);
		/*SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(user.getEmail());
     //   msg.setSubject("Testing from Spring Boot");
        msg.setText("The User has been created Successfully");

        msg.setText("UserFirstname "+addressdto.getFirstname()+" ");
        msg.setText("Email "+addressdto.getEmail()+" ");
 
       javaMailSender.send(msg); */
		
		Address address = new Address();
		//   address.setId(addressdto.getId());
		   address.setAddress1(addressdto.getAddress1());
		   address.setAddress2(addressdto.getAddress2());
		   address.setStreet(addressdto.getStreet());
		   address.setCity(addressdto.getCity());
		   address.setCountry(addressdto.getCountry());
		   address.setZipcode(addressdto.getZipcode());
		  address.setUser(user);
		   
		   addressRepository.save(address);
		   
		   SimpleMailMessage msg = new SimpleMailMessage();
	         msg.setTo(user.getEmail());
	         String Firstname = user.getFirstname();
	         String Email = user.getEmail();
	         String City = address.getCity();
	         String Country = address.getCountry();
	        msg.setSubject("Testing from Spring Boot");
	        msg.setText("The User has been created Successfully \n "+Firstname+"\n "+Email+"\n "+City+"\n "+Country+"\n "+user.getFirstname() +user.getEmail() +address.getCity() +address.getCountry());
	   //     msg.setText("UserFirstname " +user.getFirstname());
	     //   msg.setText("Email "+user.getEmail());
	      //  msg.setText("City "+address.getCity());
	      //  msg.setText("Country "+address.getCountry());

	        javaMailSender.send(msg); 

		   return addressdto;
	}	
	   
/*ublic List<AddressDto> saveOrUpdate(AddressDto addressdto)
   {
	   return userRepository.saveOrUpdate().stream().map(addressdto - > {
		AddressDto addressdto1= new AddressDto();
		addressdto1.setUserid(addressdto.getUserid());
		addressdto1.setFirstname(addressdto.getFirstname());
		addressdto1.setLastname(addressdto.getLastname());
		addressdto1.setEmail(addressdto.getEmail());
		addressdto1.setPassword(addressdto.getPassword());
		addressdto1.setId(addressdto.getId());
		addressdto1.setAddress1(addressdto.getAddress1());
		addressdto1.setAddress2(addressdto.getAddress2());
		addressdto1.setCity(addressdto.getCity());
		addressdto1.setCountry(addressdto.getCountry());
		addressdto1.setStreet(addressdto.getStreet());
		addressdto1.setZipcode(addressdto.getZipcode());
		return addressdto1;}).Collectors.toList());
			
	   }
   
*/
 
		 /*   User newUser = new User();
	        newUser.setFirstname(user.getFirstname());
        newUser.setLastname((user.getLastname()));
	        newUser.setEmail((user.getEmail()));
	        newUser.getSecurity()
	               .addAll(user
	                      .getSecurity()
	                     .stream()
	                      .map(v -> {
	                            com.example.demo.model.Security vv = securityServices.getSecurityById(v.getId());
	                           vv.setUser(Arrays.asList(newUser));
	                           return vv;
	                       }).collect(Collectors.toList()));
	    //    List <User> user = security.getAllUser();
		//return securityRepository.saveAll(user); */
		
	//		return userRepository.save(user); 
	 
	 
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
	  userRepository.deleteById(id);  
	}  
	//updating a record  
	public void update(User user, int userid)   
	{  
	  userRepository.save(user);  
	}





	

	} 



