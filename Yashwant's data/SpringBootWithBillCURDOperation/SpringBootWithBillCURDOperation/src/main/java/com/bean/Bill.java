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
	@Column(name="bid")
	private int Bid;
	
	@Column(name="ename")
	private String Ename;
	
	@Column(name="cname")
	private String Cname;
	
	@Column(name="pname")
	private String Pname;
	
	@Column(name="qty")
	private int Qty;
	
	@Column(name="price")
	private float Price;
	
	@Column(name="dop")
	private LocalDate DOP;
	
	public int getBid() {
		return Bid;
	}
	
	public void setBid(int bid) {
		Bid = bid;
	}
	
	public String getEname() {
		return Ename;
	}
	
	public void setEname(String ename) {
		Ename = ename;
	}
	
	public String getCname() {
		return Cname;
	}
	
	public void setCname(String cname) {
		Cname = cname;
	}
	
	public String getPname() {
		return Pname;
	}
	
	public void setPname(String pname) {
		Pname = pname;
	}
	
	public int getQty() {
		return Qty;
	}
	
	public void setQty(int qty) {
		Qty = qty;
	}
	
	public float getPrice() {
		return Price;
	}
	
	public void setPrice(float price) {
		Price = price;
	}
	
	public LocalDate getDOP() {
		return DOP;
	}
	
	public void setDOP(LocalDate dOP) {
		DOP = dOP;
	}
	
	@Override
	public String toString() {
		return "Bill [Bid=" + Bid + ", Ename=" + Ename + ", Cname=" + Cname + ", Pname=" + Pname + ", Qty=" + Qty
				+ ", Price=" + Price + ", DOP=" + DOP + "]";
	}
	
	
}
