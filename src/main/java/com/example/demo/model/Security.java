package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.SequenceGenerator;  

@Entity  
@Table(name = "security")
public class Security {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "security_sequence")
    @SequenceGenerator(name = "security_sequence", sequenceName = "security_sequence")
	@Column
    private int id;
	
	@Column  
    private String groupName;
    
	@Column  
    private String delete;
    
	@Column  
    private String enable;
    
	@JsonIgnore
   // @ManyToMany(mappedBy="security")
	//private List<User> user =new ArrayList<>(); 
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getGroupName() {
		return groupName;
	}



	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}



	public String getDelete() {
		return delete;
	}



	public void setDelete(String delete) {
		this.delete = delete;
	}



	public String getEnable() {
		return enable;
	}



	public void setEnable(String enable) {
		this.enable = enable;
	}

	public Security() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}
