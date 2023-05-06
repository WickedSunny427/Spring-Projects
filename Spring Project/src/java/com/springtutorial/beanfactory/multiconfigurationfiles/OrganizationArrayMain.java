package com.spring.ioc.beanfactory.multiconfigurationfiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrganizationArrayMain {

	public static void main(String[] args) {
		/**
		 * When multiple files are passed as a configuration.
		 */

		String configurations[] = { "Address.xml", "Employee.xml", "Organization.xml" };
		ApplicationContext context = new ClassPathXmlApplicationContext(configurations);

		/**
		 * When single file is passed as a configuration.
		 */

		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("Organization.xml");
		Organization organization = context.getBean("organization", Organization.class);
		organization.getOrganizationDetails();
	}

}