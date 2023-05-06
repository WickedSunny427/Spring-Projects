package com.spring.ioc.beanfactory.multiconfigurationfiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrganizationMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Organization.xml");
		Organization organization = (Organization) context.getBean("organization");
		organization.getOrganizationDetails();
	}

}