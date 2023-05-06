package com.spring.ioc.di.annotation.autowire.assignment.college;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
	
	@Value("Electronics")
	private String department1;
	
	@Value("Information Technology")
	private String department2;

	public void getDepartmentDetails() {
		System.out.println("Department 1 : " + department1);
		System.out.println("Department 2 : " + department2);
	}
}