package com.spring.ioc.di.annotation.qualifier;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("addressK")
public class Address {

	@Value("Kolkata")
	private String address1;

	@Value("Bengal")
	private String address2;

	public void getAddressDetails() {
		System.out.println("Address Line 1 :" + address1);
		System.out.println("Address Line 2 :" + address2);
	}
}