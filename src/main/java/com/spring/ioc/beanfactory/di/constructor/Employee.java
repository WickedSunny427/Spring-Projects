package com.spring.ioc.beanfactory.di.constructor;

public class Employee {

	private int emplyoeeId;
	private String emplyoeeName;
	private Address address;

	public Employee(int emplyoeeId, String emplyoeeName, Address address) {
		this.emplyoeeId = emplyoeeId;
		this.emplyoeeName = emplyoeeName;
		this.address = address;
	}

	public void getEmployeeDetails() {
		System.out.println("Employee ID : " + emplyoeeId);
		System.out.println("Employee Name : " + emplyoeeName);
		address.getAddressDetails();
	}
}