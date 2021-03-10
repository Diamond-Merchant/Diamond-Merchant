package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.annotations.Type;

import java.util.Objects;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	private long customerid;
	private String name;
	private String cemail;
	private String gender;
	private int phonenumber;
	private String password;

	public long getCustomerid() {
		return customerid;
	}
	
	public void setCustomerid(long customerid) {
		this.customerid = customerid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", name=" + name + ", cemail=" + cemail + ", gender=" + gender
				+ ", phonenumber=" + phonenumber + ", password=" + password + "]";
	}

	@Override
	    public int hashCode() {
		
	        return Objects.hash(customerid, cemail, password
	                            );
	    }
	
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer cs = (Customer) o;
        return Objects.equals(cemail, cs.cemail) &&
                Objects.equals(password, cs.password);
    }


}
