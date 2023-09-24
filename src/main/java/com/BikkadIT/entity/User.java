package com.BikkadIT.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;

	private String name;

	private String uname;

	private String password;

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", uname=" + uname + ", password=" + password + "]";
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Name setter called");
		this.name = name;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		System.out.println("Uname setter called");
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("Password setter called");
		this.password = password;
	}
}