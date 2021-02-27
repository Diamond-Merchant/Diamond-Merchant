package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "retailer")
public class Retailer {
	
	@Id
	private int rid;
	private String rname;
	private String remail;
	private int rphone;
	private String rpname;
	private String rostatus;
	private int oid;
	private int storeid;
	private int pid;
	
	
	public int getRid() {
		return rid;
	}
	
	public void setRid(int rid) {
		this.rid = rid;
	}
	
	public String getRname() {
		return rname;
	}
	
	public void setRname(String rname) {
		this.rname = rname;
	}
	
	public String getRemail() {
		return remail;
	}
	
	public void setRemail(String remail) {
		this.remail = remail;
	}
	
	public int getRphone() {
		return rphone;
	}
	
	public void setRphone(int rphone) {
		this.rphone = rphone;
	}
	
	public String getRpname() {
		return rpname;
	}
	
	public void setRpname(String rpname) {
		this.rpname = rpname;
	}
	
	public String getRostatus() {
		return rostatus;
	}
	
	public void setRostatus(String rostatus) {
		this.rostatus = rostatus;
	}
	
	public int getOid() {
		return oid;
	}
	
	public void setOid(int oid) {
		this.oid = oid;
	}
	
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

	@Override
	public String toString() {
		return "Retailer [rid=" + rid + ", rname=" + rname + ", remail=" + remail + ", rphone=" + rphone + ", rpname="
				+ rpname + ", rostatus=" + rostatus + ", oid=" + oid + ", storeid=" + storeid + ", pid=" + pid + "]";
	}

}
