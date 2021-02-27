package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "store")
public class Store {
	
	@Id
	private int storeid;
	private int contact;
	private String address;
	private String storename;
	private String email;
	private String pname;
	private float productprice;

	public int getStoreid() {
		return storeid;
	}
	
	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}
	
	public int getContact() {
		return contact;
	}
	
	public void setContact(int contact) {
		this.contact = contact;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getStorename() {
		return storename;
	}
	
	public void setStorename(String storename) {
		this.storename = storename;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPname() {
		return pname;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public float getProductprice() {
		return productprice;
	}
	
	public void setProductprice(float productprice) {
		this.productprice = productprice;
	}
	
	@Override
	public String toString() {
		return "Store [storeid=" + storeid + ", contact=" + contact + ", address=" + address + ", storename=" + storename
				+ ", email=" + email + ", product=" + pname + ", productprice=" + productprice
				+ "]";
	}

}
