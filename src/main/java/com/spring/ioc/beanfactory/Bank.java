package com.spring.ioc.beanfactory;

public class Bank {

	private int accountNumvber;
	private String customerName;

	public Bank() {
		this.accountNumvber = 123456;
		this.customerName = "Michael";
	}

	public void getDetails() {
		System.out.println("Account Number : " + accountNumvber + "\t" + "Customer Name : " + customerName);
	}
}