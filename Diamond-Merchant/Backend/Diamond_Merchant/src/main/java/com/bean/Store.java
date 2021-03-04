package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "store")
public class Store {
	
	@Id
	private int storeid;
	private int pid;
	private int oid;
	private String pname;
	private float productprice;
	private String storename;
	private int contact;
	private String address;
	private String email;
	
	
	public int getStoreid() {
		return storeid;
	}
	
	
	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}
	
	
	public int getPid() {
		return pid;
	}
	
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	
	public int getOid() {
		return oid;
	}
	
	
	public void setOid(int oid) {
		this.oid = oid;
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
	
	
	public String getStorename() {
		return storename;
	}
	
	
	public void setStorename(String storename) {
		this.storename = storename;
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
	
	
	public String getEmail() {
		return email;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "Store [storeid=" + storeid + ", pid=" + pid + ", oid=" + oid + ", pname=" + pname + ", productprice="
				+ productprice + ", storename=" + storename + ", contact=" + contact + ", address=" + address
				+ ", email=" + email + "]";
	}
	

}
