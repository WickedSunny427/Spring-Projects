package com.spring.ioc.di.annotation.jsr250.injectandnamed;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named
public class Employee {

	@Value("789")
	private int id;

	@Value("Inject Meghana")
	private String name;

	@Inject
	private Address address;

	public void getEmployeeDeails() {
		System.out.println("Employee ID : " + id);
		System.out.println("Employee Name : " + name);
		address.getAddressDetails();
	}
}