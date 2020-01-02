package com.hq.bean;

public class User {

	private Integer uid;
	private String name;
	public String getName() {
		return name;
	}
	public Integer getUid() {
		return uid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer uid, String name) {
		super();
		this.uid = uid;
		this.name = name;
	}
	
}
