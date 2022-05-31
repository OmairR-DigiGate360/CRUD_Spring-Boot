package com.omair.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String hPhone;
	private String oPhone;
	private String pPhone;
	private String email;
	private String lName;
	public User(int id, String hPhone, String oPhone, String pPhone, String email, String lName) {
		super();
		this.id = id;
		this.hPhone = hPhone;
		this.oPhone = oPhone;
		this.pPhone = pPhone;
		this.email = email;
		this.lName = lName;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String gethPhone() {
		return hPhone;
	}
	public void sethPhone(String hPhone) {
		this.hPhone = hPhone;
	}
	public String getoPhone() {
		return oPhone;
	}
	public void setoPhone(String oPhone) {
		this.oPhone = oPhone;
	}
	public String getpPhone() {
		return pPhone;
	}
	public void setpPhone(String pPhone) {
		this.pPhone = pPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", hPhone=" + hPhone + ", oPhone=" + oPhone + ", pPhone=" + pPhone + ", email="
				+ email + ", lName=" + lName + "]";
	}
}
