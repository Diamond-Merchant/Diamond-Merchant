package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	private int customerid;
	private int pid;
	private int sid;
	private int oid;
	private String name;
	private String gender;
	private int phonenumber;
	private String cemail;
	private String password;
	
	
	public int getCustomerid() {
		return customerid;
	}
	
	
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	
	
	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public int getOid() {
		return oid;
	}


	public void setOid(int oid) {
		this.oid = oid;
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
	

	public int getPhonenumber() {
		return phonenumber;
	}

	
	public void setPhonenumber(int phonenumber) {
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
		return "Customer [customerid=" + customerid + ", pid=" + pid + ", sid=" + sid + ", oid=" + oid + ", name="
				+ name + ", gender=" + gender + ", phonenumber=" + phonenumber + ", cemail=" + cemail + ", password="
				+ password + "]";
	}


}
