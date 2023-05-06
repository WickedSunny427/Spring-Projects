package com.spring.ioc.beanfactory.applicationcontext.filesystemxmlapplicationcontext;

public class Employee {

	private int employeeId;
	private String employeeName;

	public Employee() {
		System.out.println("Default Constructor");
		this.employeeId = 123;
		this.employeeName = "James";
	}

	public void getEmployeeDetails() {
		System.out.println("Employe ID : " + employeeId + "\t" + "Employee Name : " + employeeName);
	}
}