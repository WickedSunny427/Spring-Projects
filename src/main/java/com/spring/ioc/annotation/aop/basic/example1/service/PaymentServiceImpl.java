package com.spring.ioc.di.annotation.aop.basic.example1.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentServiceImpl implements PaymentService {

	public void makePayment() {
		// Payment Code

		System.out.println("Amount Credited ...");
		//
		//
		//
		System.out.println("Amount Debited ...");
	}
}