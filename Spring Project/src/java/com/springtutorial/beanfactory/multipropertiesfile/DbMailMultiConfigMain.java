package com.spring.ioc.beanfactory.multipropertiesfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DbMailMultiConfigMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("MailDbMultiConfig.xml");
		DbConfig dbConfig = context.getBean("dbconfig", DbConfig.class);
		MailConfig mailConfig = context.getBean("mailconfig", MailConfig.class);
		dbConfig.getDbDetails();
		mailConfig.getMailDetails();

	}
}