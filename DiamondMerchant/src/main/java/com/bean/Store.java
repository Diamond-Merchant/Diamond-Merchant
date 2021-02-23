package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="store")
public class Store {
	
	@Id
	private int storeid;
	private int contact;
	private String address;
	
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
	
	@Override
	public String toString() {
		return "Store [storeid=" + storeid + ", contact=" + contact + ", address=" + address + "]";
	}

}