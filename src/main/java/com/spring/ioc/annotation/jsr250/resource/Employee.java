package com.spring.ioc.di.annotation.jsr250.resource;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("774")
	private int id;

	@Value("Resource Meghana")
	private String name;

	@Resource
	private Address address;

	public void getEmployeeDeails() {
		System.out.println("Employee ID : " + id);
		System.out.println("Employee Name : " + name);
		address.getAddressDetails();
	}
}