package com.techm.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.techm.model.Employee;
import com.techm.util.DBUtil;
public class EmployeeDao {
	public boolean saveEmployee(Employee employee) {
		//Logic to store employee into table ==> insert query
		Connection connection=DBUtil.createConnection();
		String query="insert into Employee values(?,?,?,?,?)";
		try {
			PreparedStatement statement=connection.prepareStatement(query);
			statement.setString(1, employee.getEmployeeName());
			statement.setString(2, employee.getEmployeeId());
			statement.setString(3, employee.getDesignation());
			statement.setInt(4, employee.getTotalExperience());
			statement.setDouble(5, employee.getSalary());
			int result=statement.executeUpdate();
			if(result==1) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean deleteEmployee(String employeeId) {
		//Logic to store employee into table ==> delete query
		
		return true;
	}
	
	public Employee findEmployee(String employeeId) {
		//Logic to store employee into table ==> select query
		
		return null;
	}
	public ArrayList<Employee> findAllEmployee() {
		//Logic to store employee into table ==> select query
		
		return null;
	}
	
	public Employee updateEmployee(Employee employee) {
		//Logic to store employee into table ==> update query
		
		return null;
	}
	
}
