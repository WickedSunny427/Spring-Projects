package com.spring.ioc.annotation.annotationconfig.bank.service;

import org.springframework.stereotype.Service;

@Service
public class BankService {
	public void getBankService() {
		System.out.println("Inside Bank Service Method");
	}
}