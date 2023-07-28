package com.ems.dao;

import com.ems.entity.Employee;

public interface EmployeeDao {
	boolean addEmployee(Employee emp);
	boolean getEmployeelist();
	void getEmployeeID(int id);
	void deleteEmployeeID(int id);
	void updateEmployeeID(int age,int id);
	void updateEmployeeName(int age,String name);
	void getEmployeeAge(int age1,int age2);

}
