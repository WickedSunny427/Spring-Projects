package com.spring.ioc.di.annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.spring.ioc.di.annotation.qualifier.subpackage.Address;
@Component
public class Employee {

	@Value("658")
	private int id;

	@Value("Vidya")
	private String name;

	@Qualifier("addressT")
	@Autowired
	private Address address;
	
	public void getEmployeeDeails() {
		System.out.println("Employee ID : " + id);
		System.out.println("Employee Name : " + name);
		address.getAddressDetails();
	}
}