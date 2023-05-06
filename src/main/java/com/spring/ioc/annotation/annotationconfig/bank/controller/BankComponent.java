package com.spring.ioc.annotation.annotationconfig.bank.controller;

import org.springframework.stereotype.Component;

@Component
public class BankComponent {
	private String name = "HDFC";
	private String ifsc = "HDFC046464";

	public BankComponent() {
		System.out.println("Bank Name : " + name);
		System.out.println("Bank Name : " + ifsc);

	}

	public void getBankComponent() {
		System.out.println("Inside Component");
	}
}