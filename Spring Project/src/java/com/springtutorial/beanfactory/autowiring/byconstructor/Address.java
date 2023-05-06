package com.spring.ioc.beanfactory.autowiring.byconstructor;

public class Address {

	private String address1;
	private String address2;

	public Address(String address1, String address2) {
		this.address1 = address1;
		this.address2 = address2;
	}

	public void getAddressDetails() {
		System.out.println("Addres Line 1 : " + address1);
		System.out.println("Addres Line 2 : " + address2);
	}
}