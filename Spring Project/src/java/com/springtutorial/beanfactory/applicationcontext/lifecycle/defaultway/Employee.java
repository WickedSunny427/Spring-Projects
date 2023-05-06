package com.spring.ioc.beanfactory.applicationcontext.lifecycle.defaultway;

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

	// Initializing bean method
	public void initializingBeanCustom() {
		System.out.println("Employee bean initializing method invoked ...");
	}

	// Destroying bean method
	public void destroyingBeanCustom() {
		System.out.println("Employee bean destroying method invoked ...");
	}
}