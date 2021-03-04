package com.bean;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	private int eid;
	private int sid;
	private String ename;
	private String gender;
	private int ephonenumber;
	private LocalDate birthdate;
	private LocalDate joiningdate;
    private String designation;
    private String email;
    
    
	public int getEid() {
		return eid;
	}
	
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	
	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getEname() {
		return ename;
	}
	
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	public String getGender() {
		return gender;
	}
	
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public int getEphonenumber() {
		return ephonenumber;
	}


	public void setEphonenumber(int ephonenumber) {
		this.ephonenumber = ephonenumber;
	}


	public LocalDate getBirthdate() {
		return birthdate;
	}
	

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	
	public LocalDate getJoiningdate() {
		return joiningdate;
	}

	
	public void setJoiningdate(LocalDate joiningdate) {
		this.joiningdate = joiningdate;
	}

	
	public String getDesignation() {
		return designation;
	}
	
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", sid=" + sid + ", ename=" + ename + ", gender=" + gender + ", ephonenumber="
				+ ephonenumber + ", birthdate=" + birthdate + ", joiningdate=" + joiningdate + ", designation="
				+ designation + ", email=" + email + "]";
	}

	
	
}
