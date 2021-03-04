package com.bean;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="orders")
public class Orders {
	
	@Id
	private int oid;
	private int cid;
	private int rid;
	private int pid;
	private String pname;
	private int oqty;
	private float oprice;
	private LocalDate odate;
	private String ostatus;
	
	
	public int getOid() {
		return oid;
	}
	
	
	public void setOid(int oid) {
		this.oid = oid;
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
	

	public String getPname() {
		return pname;
	}
	
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
	public int getOqty() {
		return oqty;
	}
	
	
	public void setOqty(int oqty) {
		this.oqty = oqty;
	}
	
	
	public float getOprice() {
		return oprice;
	}
	
	
	public void setOprice(float oprice) {
		this.oprice = oprice;
	}
	
	
	public LocalDate getOdate() {
		return odate;
	}
	
	
	public void setOdate(LocalDate odate) {
		this.odate = odate;
	}
	
	
	public String getOstatus() {
		return ostatus;
	}
	
	
	public void setOstatus(String ostatus) {
		this.ostatus = ostatus;
	}


	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", cid=" + cid + ", rid=" + rid + ", pid=" + pid + ", pname=" + pname + ", oqty="
				+ oqty + ", oprice=" + oprice + ", odate=" + odate + ", ostatus=" + ostatus + "]";
	}
	
}
