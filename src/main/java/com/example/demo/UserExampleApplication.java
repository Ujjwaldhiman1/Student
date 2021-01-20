package com.example.demo;



//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableJpaAuditing
@EnableSwagger2
@SpringBootApplication
//@EnableWebSecurity
public class UserExampleApplication{
   

    public static void main(String[] args){
		SpringApplication.run(UserExampleApplication.class, args);
	}
	
	

}


