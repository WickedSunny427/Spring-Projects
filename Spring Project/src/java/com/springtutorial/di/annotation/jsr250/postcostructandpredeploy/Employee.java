package com.spring.ioc.di.annotation.jsr250.postcostructandpredeploy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("558")
	private int id;

	@Value("Meghana")
	private String name;
	@Autowired
	private Address address;

	@PostConstruct
	public void postConstruct() {
		System.out.println("Invoking Post Costruct Annotation ...");
	}
	@PreDestroy
	public void predestroy() {
		System.out.println("Invoking Pre Destroy Annotation ...");
	}
	
	public void getEmployeeDeails() {
		System.out.println("Employee ID : " + id);
		System.out.println("Employee Name : " + name);
		address.getAddressDetails();
	}
}