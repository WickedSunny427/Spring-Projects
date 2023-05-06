package com.spring.ioc.beanfactory.multiconfigurationfiles;

public class Organization {
	private int organizationCode;
	private String organizationName;
	private Employee employee;
	private Address address;

	public void setOrganizationCode(int organizationCode) {
		this.organizationCode = organizationCode;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void getOrganizationDetails() {

		employee.getEmployeeDetails();
		address.getAddressDetails();
		System.out.println("Organisation Code : " + organizationCode);
		System.out.println("Organisation Name : " + organizationName);
	}

}