package com.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bill")
public class Bill {
	
	@Id
	private int bid;
	private String ename;
	private String cname;
	private String pname;
	private int qty;
	private float price;
	private LocalDate dop;
	
	public int getBid() {
		return bid;
	}
	
	public void setBid(int bid) {
		this.bid = bid;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public String getCname() {
		return cname;
	}
	
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public String getPname() {
		return pname;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public LocalDate getDop() {
		return dop;
	}
	
	public void setDop(LocalDate dop) {
		this.dop = dop;
	}
	
	@Override
	public String toString() {
		return "Bill [bid=" + bid + ", ename=" + ename + ", cname=" + cname + ", pname=" + pname + ", qty=" + qty
				+ ", price=" + price + ", dop=" + dop + "]";
	}
	
	
	
	
}
