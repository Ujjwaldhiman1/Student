package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {
	  
	  @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long id;
      
	  private String address1;
      
      
      private String address2;
      
      
      private String street;
      
      
      private String city;
      
      
      private String country;
      
      
      private String zipcode;
      
      @ManyToOne(fetch = FetchType.EAGER, optional = false)
      @JoinColumn(name = "user_id")
     
      private User user;
      
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(Long id, String address1, String address2, String street, String city, String country,
			String zipcode, User user) {
		super();
		this.id = id;
		this.address1 = address1;
		this.address2 = address2;
		this.street = street;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", address1=" + address1 + ", address2=" + address2 + ", street=" + street
				+ ", city=" + city + ", country=" + country + ", zipcode=" + zipcode + ", user=" + user + "]";
	}

	
}
