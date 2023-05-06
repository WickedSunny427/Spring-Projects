package com.spring.ioc.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class BeanFactoryMain {

	public static void main(String[] args) {

		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("BeanFactory.xml"));

		Employee employee = beanFactory.getBean("employee", Employee.class);
		employee.getEmployeeDetails();

		Bank bank = beanFactory.getBean("bank", Bank.class);
		bank.getDetails();

		Student student = beanFactory.getBean("student", Student.class);
		student.getStudentDetails();

		Marks marks = beanFactory.getBean("marks", Marks.class);
		marks.getMarksDetails();
	}

}