package com.ems.dao;
import com.ems.entity.Employee;
import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDaoImpl implements EmployeeDao{
	Connection con=null;
	PreparedStatement pstmt;
	public EmployeeDaoImpl() throws SQLException{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/july","root","root");
	}

	@Override
	public boolean addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
			pstmt.setInt(1, emp.getEid());
			pstmt.setString(2, emp.getEname());
			pstmt.setInt(3, emp.getAge());
			pstmt.setString(4, emp.getGender());
			pstmt.setLong(5, emp.getPhoneno());
			pstmt.setString(6, emp.getAddress());
			pstmt.setString(7, emp.getDate_of_joining());
			pstmt.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return true;
	}

	@Override
	public boolean getEmployeelist() {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("select * from employee");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3)+rs.getString(4)+rs.getLong(5)+rs.getString(6)+rs.getString(7));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}

	@Override
	public void getEmployeeID(int id) {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("select * from employee where eid=?");
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3)+rs.getString(4)+rs.getLong(5)+rs.getString(6)+rs.getString(7));
				
			}
	
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void deleteEmployeeID(int id) {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("delete from employee where eid=?");
			pstmt.setInt(1, id);
			int i=pstmt.executeUpdate();
			if(i!=0) {
				System.out.println("deleted");
			}
			else {
				System.out.println("not deleted");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void updateEmployeeID(int age, int id) {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("update employee set age=? where eid=?");
			pstmt.setInt(1, age);
			pstmt.setInt(2, id);
			int i=pstmt.executeUpdate();
			if(i!=0) {
				System.out.println("updated");
			}
			else {
				System.out.println("not updated");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void updateEmployeeName(int age, String name) {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("update employee set age=? where ename=?");
			pstmt.setInt(1, age);
			pstmt.setString(2, name);
			int i=pstmt.executeUpdate();
			if(i!=0) {
				System.out.println("updated");
			}
			else {
				System.out.println("not updated");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void getEmployeeAge(int age1, int age2) {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("select * from employee where age between ? and ?");
			pstmt.setInt(1, age1);
			pstmt.setInt(2, age2);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3)+rs.getString(4)+rs.getLong(5)+rs.getString(6)+rs.getString(7));
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
