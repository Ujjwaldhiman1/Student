package com.example.demo.model;
import javax.persistence.Entity;

import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonRootName;

import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
// import javax.persistence.JoinTable;
// import javax.persistence.ManyToMany;
// import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.SequenceGenerator;
// import javax.persistence.JoinColumn;

@Entity

@JsonRootName(value = "user")
@Table
public class User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence")
	private int userid;
	
	@Column 
	
	private String firstname;
	
	@Column  

	private String lastname;
    
	@Column


	private String email ;
	
	@Column  

	private String password;
    
	/*@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST,CascadeType.ALL })
	 @JoinTable(
			  name = "user_security", 
			  joinColumns = @JoinColumn(name = "user_id"), 
			  inverseJoinColumns = @JoinColumn(name = "id"))
	private List<Security> security=new ArrayList<Security>(); 
	*/
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(int userid, String firstname, String lastname, String email, String password) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + "]";
	}	
	}
	
	
