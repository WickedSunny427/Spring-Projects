package com.spring.ioc.beanfactory.multiconfigurationfiles;

public class Employee {

	private int emplyoeeId;
	private String emplyoeeName;

	public void setEmplyoeeId(int emplyoeeId) {
		this.emplyoeeId = emplyoeeId;
	}

	public void setEmplyoeeName(String emplyoeeName) {
		this.emplyoeeName = emplyoeeName;
	}

	public void getEmployeeDetails() {
		System.out.println("Employee ID : " + emplyoeeId);
		System.out.println("Employee Name : " + emplyoeeName);
	}
}