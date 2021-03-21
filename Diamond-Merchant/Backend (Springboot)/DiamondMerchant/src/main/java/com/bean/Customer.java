package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	private int customerid;
	private String name;
	private String gender;
	private String phonenumber;
	private String cemail;
	private String password;
	
	
	public int getCustomerid() {
		return customerid;
	}
	
	
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getGender() {
		return gender;
	}
	
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	
	
	public String getPassword() {
		return password;
	}
	
	
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", name=" + name + ", gender=" + gender + ", phonenumber="
				+ phonenumber + ", cemail=" + cemail + ", password=" + password + "]";
	}
	
	
	
	

}
