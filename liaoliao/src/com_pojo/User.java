package com_pojo;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String name;
	private String password;
	private int phone;
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
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", phone=" + phone + "]";
	}
	
}
