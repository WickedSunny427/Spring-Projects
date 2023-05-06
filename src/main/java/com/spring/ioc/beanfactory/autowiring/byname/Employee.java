package com.spring.ioc.beanfactory.autowiring.byname;

public class Employee {

	private int emplyoeeId;
	private String emplyoeeName;
	private Address address;

	public void setEmplyoeeId(int emplyoeeId) {
		this.emplyoeeId = emplyoeeId;
	}

	public void setEmplyoeeName(String emplyoeeName) {
		this.emplyoeeName = emplyoeeName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void getEmployeeDetails() {
		System.out.println("Employee ID : " + emplyoeeId);
		System.out.println("Employee Name : " + emplyoeeName);
		address.getAddressDetails();
	}
}