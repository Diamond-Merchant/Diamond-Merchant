package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	private int pid;
	private int sid;
	private String pname;
	private String shelflocation;
	private float costprice;
	private float mrp;
	private String manufacturer;
	
	
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


	public String getPname() {
		return pname;
	}
	
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
	public String getShelflocation() {
		return shelflocation;
	}
	
	
	public void setShelflocation(String shelflocation) {
		this.shelflocation = shelflocation;
	}
	
	
	public float getCostprice() {
		return costprice;
	}
	
	
	public void setCostprice(float costprice) {
		this.costprice = costprice;
	}
	
	
	public float getMrp() {
		return mrp;
	}
	
	
	public void setMrp(float mrp) {
		this.mrp = mrp;
	}
	
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", sid=" + sid + ", pname=" + pname + ", shelflocation=" + shelflocation
				+ ", costprice=" + costprice + ", mrp=" + mrp + ", manufacturer=" + manufacturer + "]";
	}
	
	
	
}
