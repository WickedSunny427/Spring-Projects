package com.spring.ioc.di.annotation.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Value("1st Cross")
	private String address1;

	@Value("Electronic City, Bangalore")
	private String address2;

	public void getAddressDetails() {
		System.out.println("Address Line 1 :" + address1);
		System.out.println("Address Line 2 :" + address2);
	}
}