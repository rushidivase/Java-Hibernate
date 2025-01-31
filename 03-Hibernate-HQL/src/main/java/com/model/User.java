package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // It is used to create the table
@Table(name="User_Data")
public class User {

	@Id // It is used to set primary key
	@Column(name="userId")
	private int uid;
	
	@Column(name="userName")
	private String uname;
	
	@Column(name="mobileNumber")
	private long mono;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public long getMono() {
		return mono;
	}

	public void setMono(long mono) {
		this.mono = mono;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", mono=" + mono + "]";
	}

}
