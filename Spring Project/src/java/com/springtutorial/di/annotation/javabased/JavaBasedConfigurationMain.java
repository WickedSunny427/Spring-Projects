package com.spring.ioc.di.annotation.javabased;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedConfigurationMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				"com.spring.ioc.di.annotation.javabased");
		Date date = context.getBean("myDate", Date.class);
		System.out.println(date);
	}
}