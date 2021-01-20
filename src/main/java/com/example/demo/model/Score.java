package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class Score {
	
	@Id
	@Column(name="scoreid")
	private Integer scoreid;

	@Column(name="subject")
	private String subject;
	
	@Column(name="percentage")
	private int percentage;
	
   // @ManyToOne(fetch = FetchType.EAGER, optional = false)
   // @JoinColumn(name = "rollno")

    

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Score(String subject, int percentage) {
		super();
		this.subject = subject;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Score [subject=" + subject + ", percentage=" + percentage + "]";
	}

	public Integer getScoreid() {
		return scoreid;
	}

	public void setScoreid(Integer scoreid) {
		this.scoreid = scoreid;
	}

	
	
	
}
