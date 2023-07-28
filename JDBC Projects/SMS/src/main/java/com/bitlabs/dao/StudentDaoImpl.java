package com.bitlabs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bitlabs.entity.Student;

public class StudentDaoImpl implements StudentDao {
	Connection con=null;
	PreparedStatement pstmt;
	
	//connection
	public StudentDaoImpl() throws SQLException{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/july","root","root");
		if(con!=null) {
			System.out.println("Connection Successful");
		}
		else
		{
			System.out.println("not connected");
		}
	}

	@Override
	public int addStudent(Student st) {
		int i=0;
		try {

            pstmt=con.prepareStatement("insert into student values(?,?,?,?,?)");

            pstmt.setInt(1, st.getId());

            pstmt.setString(2, st.getName());

            pstmt.setInt(3, st.getAge());

            pstmt.setString(4, st.getEmail());

            pstmt.setString(5, st.getAddress());

           i=pstmt.executeUpdate();

        }

        catch(Exception e) {

            System.out.println(e);

        }
		return i;
	}
	 public void getStudent()  {

	        // TODO Auto-generated method stub

	        try {

	            pstmt=con.prepareStatement("select * from student");

	            ResultSet rs=pstmt.executeQuery();

	            while(rs.next()) {

	                System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3)+rs.getString(4)+rs.getString(5));

	            }

	        }

	        catch(Exception e) {

	            System.out.println(e);

	        }
	 }
	 public void getStudentbyID(int id) {
		 try {

	            pstmt=con.prepareStatement("select * from student where id=?");
	            pstmt.setInt(1, id);

	            ResultSet rs=pstmt.executeQuery();

	            while(rs.next()) {

	                System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3)+rs.getString(4)+rs.getString(5));

	            }

	        }

	        catch(Exception e) {

	            System.out.println(e);

	        }
	 }
	 @Override
		public int updateStudentById(int id, String name) {
			// TODO Auto-generated method stub
			try {
				pstmt=(PreparedStatement) con.prepareStatement("update student set name=? where id=?");
				pstmt.setString(1,name);
				pstmt.setInt(2, id);
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

	 public void deleteStudentById(int id) {
		 try {
	            pstmt=con.prepareStatement("delete from student where id=?");
	            pstmt.setInt(1, id);
	            int i=pstmt.executeUpdate();
	            if (i!=0) {
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
	

}
