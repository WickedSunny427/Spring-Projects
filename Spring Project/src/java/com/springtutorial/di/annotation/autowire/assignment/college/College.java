package com.spring.ioc.di.annotation.autowire.assignment.college;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Value("1001")
	private int id;
	
	@Value("PSET")
	private String name;
	
	@Inject
	private Department department;

	public void getCollegeDetails() {
		System.out.println("College ID : " + id);
		System.out.println("College Name : " + name);
		department.getDepartmentDetails();
	}
}
