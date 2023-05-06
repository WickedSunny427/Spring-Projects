package com.spring.ioc.beanfactory.propertiesfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MailConfigMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("MailConfig.xml");

		MailConfig mailConfig = (MailConfig) context.getBean("mailconfig");
		mailConfig.getMailDetails();
	}
}