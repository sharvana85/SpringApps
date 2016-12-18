package com.springApp.jdbcTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		//System.out.println("-->"+System.getProperty("java.class.path"));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		
		IEmployeeDAO employeeDAO = (IEmployeeDAO) context.getBean("EmployeeDAO");
		
		Employee employee = employeeDAO.findByEmployee(1);
        System.out.println("Employee A : " + employee);
        
        
	}

}
