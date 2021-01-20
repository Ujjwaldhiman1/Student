package com.example.demo.model;

public class AddressDto {
	
	//private int userid;
	 
	private String firstname;
	
	private String lastname;
	
	private String email;
	
	private String password;
	
//	private Long id;
	
	private String address1;
	
	private String address2;
	
    private String city;
    
    private String country;

	private String zipcode;
	
	private String street;

//	private User user;

	public AddressDto() {
		super();
		// TODO Auto-generated constructor stub
	}

/*	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}
*/
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

/*	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
*/
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

	public AddressDto(int userid, String firstname, String lastname, String email, String password, Long id,
			String address1, String address2, String city, String country, String zipcode) {
		super();
	//	this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
	//	this.id = id;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
	}

//	@Override
	/*public String toString() {
		return "AddressDto [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", password=" + password + ", id=" + id + ", address1=" + address1 + ", address2=" + address2
				+ ", city=" + city + ", country=" + country + ", zipcode=" + zipcode + "]";
	}
*/
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

/*	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
*/
	
}
