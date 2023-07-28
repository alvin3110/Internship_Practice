package com.bitlabs.entity;

public class Supplier {
	private int s_id;
	private String s_name;
	private long s_contact;
	private String s_mail;
	private String s_address;
	
	public Supplier(int s_id, String s_name, long s_contact, String s_mail, String s_address) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_contact = s_contact;
		this.s_mail = s_mail;
		this.s_address = s_address;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public long getS_contact() {
		return s_contact;
	}

	public void setS_contact(long s_contact) {
		this.s_contact = s_contact;
	}

	public String getS_mail() {
		return s_mail;
	}

	public void setS_mail(String s_mail) {
		this.s_mail = s_mail;
	}

	public String getS_address() {
		return s_address;
	}

	public void setS_address(String s_address) {
		this.s_address = s_address;
	}

	
}
