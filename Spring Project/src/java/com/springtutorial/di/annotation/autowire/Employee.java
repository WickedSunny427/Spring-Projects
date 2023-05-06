package com.spring.ioc.di.annotation.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("007")
	private int id;

	@Value("Sam")
	private String name;
	@Autowired
	private Address address;

	public void getEmployeeDeails() {
		System.out.println("Employee ID : " + id);
		System.out.println("Employee Name : " + name);
		address.getAddressDetails();
	}
}