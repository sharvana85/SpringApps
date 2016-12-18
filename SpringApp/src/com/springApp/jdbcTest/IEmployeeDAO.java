package com.springApp.jdbcTest;

import java.util.List;

public interface IEmployeeDAO {
	
	public Employee findByEmployee(int employeeId);
		
	public List<Employee> findAll();

}
