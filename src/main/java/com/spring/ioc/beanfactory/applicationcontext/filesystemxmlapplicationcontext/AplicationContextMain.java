package com.spring.ioc.beanfactory.applicationcontext.filesystemxmlapplicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AplicationContextMain {

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"D:\\Study Material\\Emexo\\Workspace_1\\SpringProject\\src\\main\\resources\\FileSystem.xml");
		Employee employee = context.getBean("employee", Employee.class);
		employee.getEmployeeDetails();
	}
}