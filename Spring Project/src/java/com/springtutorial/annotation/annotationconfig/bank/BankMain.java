package com.spring.ioc.annotation.annotationconfig.bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.ioc.annotation.annotationconfig.bank.controller.BankComponent;
import com.spring.ioc.annotation.annotationconfig.bank.dao.BankDao;
import com.spring.ioc.annotation.annotationconfig.bank.service.BankService;

public class BankMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				"com.spring.ioc.annotation.annotationconfig.bank");

		BankComponent bankComponent = context.getBean("bankComponent", BankComponent.class);
		bankComponent.getBankComponent();

		BankService bankService = context.getBean("bankService", BankService.class);
		bankService.getBankService();

		BankDao bankDao = context.getBean("bankDao", BankDao.class);
		bankDao.getBankDao();
	}
}