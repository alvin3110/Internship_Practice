package com.ems.entity;

public class Employee {
	private int eid;
	private String ename;
	private int age;
	private String gender;
	private long phoneno;
	private String address;
	private String date_of_joining;
	public Employee(int eid, String ename, int age, String gender, long phoneno, String address,
			String date_of_joining) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.age = age;
		this.gender = gender;
		this.phoneno = phoneno;
		this.address = address;
		this.date_of_joining = date_of_joining;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate_of_joining() {
		return date_of_joining;
	}
	public void setDate_of_joining(String date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

}
