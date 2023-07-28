package com.bitlabs.dao;

import com.bitlabs.entity.Product;

public interface Productdao {
	public boolean addProduct(Product pro);
	public int updateProduct(int P,double price);
	public int getProductBySku(int sku);
	public int sortProductBySku();
	public int getProduct();
}
