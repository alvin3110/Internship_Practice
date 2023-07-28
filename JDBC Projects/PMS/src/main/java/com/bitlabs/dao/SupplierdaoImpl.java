package com.bitlabs.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.bitlabs.entity.Supplier;

public class SupplierdaoImpl implements Supplierdao{
	Connection con=null;
	  PreparedStatement pstmt;
	  public SupplierdaoImpl() throws SQLException{
		  con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/PMS","root","root");
		  
	  }

	@Override
	public boolean addSupplier(Supplier sup) {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("insert into supplier values(?,?,?,?,?)");
			pstmt.setInt(1, sup.getS_id());
			pstmt.setString(2, sup.getS_name());
			pstmt.setLong(3, sup.getS_contact());
			pstmt.setString(4, sup.getS_mail());
			pstmt.setString(5, sup.getS_address());
			pstmt.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}

	@Override
	public int getSupplier() {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("select * from supplier");
			ResultSet rs=pstmt.executeQuery();
	         while(rs.next()) {
	             System.out.println(rs.getInt(1)+rs.getString(2)+rs.getLong(3)+rs.getString(4)+rs.getString(5));
	         }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	@Override
	public int updateSupplier(int supid, String supaddress) {
		// TODO Auto-generated method stub
		try {
		pstmt=(PreparedStatement) con.prepareStatement("update supplier set supaddress=? where s_id=?");
		pstmt.setString(1, supaddress);
		pstmt.setInt(2, supid);
		int i=pstmt.executeUpdate();
		if(i!=0) {
			System.out.println("Updated successfully");
		}
		else {
			System.out.println("not updated");
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	@Override
	public int deleteSupplier(int supid) {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("delete from supplier where s_id=?");
			pstmt.setInt(1, supid);
			int i=pstmt.executeUpdate();
			if(i!=0) {
				System.out.println("Deleted successfully");
			}
			else {
				System.out.println("not deleted");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	@Override
	public int getSupplierById(int id) {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("select * from supplier where s_id=?");
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
	         while(rs.next()) {
	             System.out.println(rs.getInt(1)+rs.getString(2)+rs.getLong(3)+rs.getString(4)+rs.getString(5));
	         }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}


}
