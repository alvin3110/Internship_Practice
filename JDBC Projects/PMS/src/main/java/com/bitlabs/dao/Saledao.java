package com.bitlabs.dao;

import com.bitlabs.entity.Sale;

public interface Saledao {
	public boolean addSales(Sale s);
	public int getSales();
	public int updateSales(int sid,double revenue);
	public int searchSalesById(int id);
	public int deleteSalesById(int id);
}
