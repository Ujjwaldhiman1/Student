package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	@Column
	private Integer rollno;
	
	@Column
	private String name;
	
	@Column
	private String age;
	
	//@OneToMany(cascade = CascadeType.ALL)
	@OneToMany(mappedBy="scoreId",fetch = FetchType.EAGER,cascade =CascadeType.ALL)
	//@JoinColumn(name="scoreId")
	
	private List<Score> score; 



	public Integer getRollno() {
		return rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public List<Score> getScore() {
		return score;
	}

	public void setScore(List<Score> score) {
		this.score = score;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String name, String age, List<Score> score) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
}
