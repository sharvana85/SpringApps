package com.springApp.jdbcTest;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcEmployeeDAO extends JdbcDaoSupport implements IEmployeeDAO  {

	public Employee findByEmployee(int employeeId){
		String sql = "SELECT * FROM Employee WHERE employeeid = ?";		 
		Employee employee = (Employee)getJdbcTemplate().queryForObject(sql, new Object[] { employeeId }, new EmployeeRowMapper());	
		return employee;
	}
	
	public List<Employee> findAll(){
		String sql = "SELECT * FROM Employee";
		 
		//List<Employee> employees = new ArrayList<Employee>();
		
		List<Employee> employees = getJdbcTemplate().query(sql,new BeanPropertyRowMapper(Employee.class));		
		
		return employees;
	}
	
	
}
