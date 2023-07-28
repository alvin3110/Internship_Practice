package com.bitlabs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bitlabs.entity.Product;

public class ProductdaoImpl implements Productdao {
	Connection con=null;
	  PreparedStatement pstmt;
	  public ProductdaoImpl() throws SQLException{
		  con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/PMS","root","root");
		  
	  }
	@Override
	public boolean addProduct(Product pro) {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("insert into product values(?,?,?,?,?,?)");
			pstmt.setInt(1, pro.getP_id());
			pstmt.setString(2, pro.getP_name());
			pstmt.setString(2,pro.getP_info());
			pstmt.setInt(4, pro.getP_quantity());
			pstmt.setInt(5, pro.getSup().getS_id());
			pstmt.setDouble(6, pro.getP_price());
		}
		catch(Exception e) {
			System.out.println(e);
		}

		return false;
	}
	@Override
	public int updateProduct(int p_id, double p_price) {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("update product set p_price=? where p_pid=?");
			pstmt.setDouble(1, p_price);
			pstmt.setInt(2, p_id);
			pstmt.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	@Override
	public int getProductBySku(int p_id) {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("select * from product where p_id=?");
			pstmt.setInt(1, p_id);
			 ResultSet rs=pstmt.executeQuery();
	         while(rs.next()) {
	             System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3)+rs.getInt(4)+rs.getInt(5)+rs.getDouble(6));
	         }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	@Override
	public int sortProductBySku() {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("select * from product order by p_id");
			ResultSet rs=pstmt.executeQuery();
	        while(rs.next()) {
	            System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3)+rs.getInt(4)+rs.getInt(5)+rs.getDouble(6));
	        }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	@Override
	public int getProduct() {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("select * from product");
			ResultSet rs=pstmt.executeQuery();
	        while(rs.next()) {
	            System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3)+rs.getInt(4)+rs.getInt(5)+rs.getDouble(6));
	        }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}
}
