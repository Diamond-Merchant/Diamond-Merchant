package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "retailer")
public class Retailer {
	
	@Id
	private int rid;
	private int pid;
	private int sid;
	private int oid;
	private String rname;
	private String remail;
	private String rpassword;
	private int rphone;
	private String raddress;
	
	
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
	
	
	public String getRpassword() {
		return rpassword;
	}
	

	public void setRpassword(String rpassword) {
		this.rpassword = rpassword;
	}

	
	public int getRphone() {
		return rphone;
	}
	
	
	public void setRphone(int rphone) {
		this.rphone = rphone;
	}


	public String getRaddress() {
		return raddress;
	}


	public void setRaddress(String raddress) {
		this.raddress = raddress;
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


	@Override
	public String toString() {
		return "Retailer [rid=" + rid + ", pid=" + pid + ", sid=" + sid + ", oid=" + oid + ", rname=" + rname
				+ ", remail=" + remail + ", rpassword=" + rpassword + ", rphone=" + rphone + ", raddress=" + raddress
				+ "]";
	}


}
