package com.bean;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bill")
public class Bill {
	
	@Id
	private int bid;
	private int eid;
	private int cid;
	private int rid;
	private int pid;
	private int sid;
	private int oid;
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
	
	
	public int getEid() {
		return eid;
	}

	
	public void setEid(int eid) {
		this.eid = eid;
	}

	
	public int getCid() {
		return cid;
	}

	
	public void setCid(int cid) {
		this.cid = cid;
	}

	
	public int getRid() {
		return rid;
	}

	
	public void setRid(int rid) {
		this.rid = rid;
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
		return "Bill [bid=" + bid + ", eid=" + eid + ", cid=" + cid + ", rid=" + rid + ", pid=" + pid + ", sid=" + sid
				+ ", oid=" + oid + ", ename=" + ename + ", cname=" + cname + ", pname=" + pname + ", qty=" + qty
				+ ", price=" + price + ", dop=" + dop + "]";
	}


	
	
	
}