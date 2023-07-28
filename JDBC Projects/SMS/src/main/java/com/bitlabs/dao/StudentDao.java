package com.bitlabs.dao;

import com.bitlabs.entity.Student;

public interface StudentDao {
	public int addStudent(Student st);
	public void getStudent();
	public void getStudentbyID(int id);
	public int updateStudentById(int id, String name);
	public void deleteStudentById(int id);
}
