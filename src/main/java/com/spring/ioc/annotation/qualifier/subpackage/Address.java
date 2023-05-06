package com.spring.ioc.di.annotation.qualifier.subpackage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("addressT")
public class Address {

	@Value("Chennai")
	private String address1;

	@Value("Tamilnadu")
	private String address2;

	public void getAddressDetails() {
		System.out.println("Address Line 1 :" + address1);
		System.out.println("Address Line 2 :" + address2);
	}
}