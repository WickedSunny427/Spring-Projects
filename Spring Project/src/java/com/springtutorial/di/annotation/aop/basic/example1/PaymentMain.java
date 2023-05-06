package com.spring.ioc.di.annotation.aop.basic.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.ioc.di.annotation.aop.basic.example1.service.PaymentService;

public class PaymentMain {

	public static void main(String[] args) {
		// ApplicationContext context = new ClassPathXmlApplicationContext("Aop.xml");
		// //if using XML based configuration instead of Annotation based configuration.
		ApplicationContext context = new AnnotationConfigApplicationContext(
				"com.spring.ioc.di.annotation.aop.basic.example1");
		// PaymentService payment = context.getBean("paymentServiceImpl",
		// PaymentService.class);
		PaymentService payment = context.getBean("paymentServiceImpl", PaymentService.class);
		payment.makePayment();
	}
}