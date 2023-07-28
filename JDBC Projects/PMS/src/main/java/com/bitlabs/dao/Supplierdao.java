package com.bitlabs.dao;

import com.bitlabs.entity.Supplier;

public interface Supplierdao {
	public boolean addSupplier(Supplier sup);
	public int getSupplier();
	public int updateSupplier(int supid,String supaddress);
	public int deleteSupplier(int supid);
	public int getSupplierById(int id);
}
