package com.springApp.jdbcTest;

public class Employee {

	long employeeid;
	String firstname;
	int age;
	
	
	public long getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(long employeeid) {
		this.employeeid = employeeid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Empolyee [age=" + age + ", employeeid=" + employeeid + ", name=" + firstname
				+ "]";
	}
	
	
	
	
}
