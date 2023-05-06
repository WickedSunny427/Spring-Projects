package com.spring.ioc.di.annotation.jsr250.injectandnamed;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Value("Pune Inject")
	private String address1;

	@Value("Nielsen Inject")
	private String address2;

	public void getAddressDetails() {
		System.out.println("Address Line 1 :" + address1);
		System.out.println("Address Line 2 :" + address2);
	}
}