package com.spring.ioc.beanfactory.autowiring.bytype;

public class Address {

	private String address1;
	private String address2;

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public void getAddressDetails() {
		System.out.println("Addres Line 1 : " + address1);
		System.out.println("Addres Line 2 : " + address2);
	}
}