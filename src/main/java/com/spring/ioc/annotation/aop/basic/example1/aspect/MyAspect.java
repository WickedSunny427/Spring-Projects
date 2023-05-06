package com.spring.ioc.di.annotation.aop.basic.example1.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class MyAspect {

	@Before("execution(* com.spring.ioc.di.annotation.aop.basic.example1.service.PaymentServiceImpl.makePayment(..))")
	public void printBeforePayment() {
		System.out.println("Payment Initiation Started ...");
	}

	@After("execution(* com.spring.ioc.di.annotation.aop.basic.example1.service.PaymentServiceImpl.makePayment(..))")
	public void printAfterPayment() {
		System.out.println("Payment Completed Successfully ...");
	}
}
