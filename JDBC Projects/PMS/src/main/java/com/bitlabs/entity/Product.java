package com.bitlabs.entity;

public class Product {
	private int p_id;
	private String p_name;
	private String p_info;
	private int p_quantity;
	private Supplier sup;
	private double p_price;
	
	public Product(int p_id, String p_name, String p_info, Supplier sup, int p_quantity, double p_price) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_info = p_info;
		this.p_quantity = p_quantity;
		this.sup = sup;
		this.p_price = p_price;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_info() {
		return p_info;
	}
	public void setP_info(String p_info) {
		this.p_info = p_info;
	}
	public int getP_quantity() {
		return p_quantity;
	}
	public void setP_quantity(int p_quantity) {
		this.p_quantity = p_quantity;
	}
	public Supplier getSup() {
		return sup;
	}
	public void setSup(Supplier sup) {
		this.sup = sup;
	}
	public double getP_price() {
		return p_price;
	}
	public void setP_price(double p_price) {
		this.p_price = p_price;
	}

}
