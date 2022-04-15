package com.capgemini.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="register")
@Entity
public class Register {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private String email;
	private long mobile;
	private String name;
	private String password;
	public Register() {
		super();
	}
	public Register(String email,long mobile,String name,String password) {
		super();
		this.email=email;
		this.mobile=mobile;
		this.name=name;
		this.password=password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Register [email=" + email + ", mobile=" + mobile + ", name=" + name + ", password=" + password + "]";
	}
	
	

}
