package com.spring.assignment.library.entity;

import java.util.Map;
import java.util.Properties;

public class Members {

	private Map<String, String> admins;
	private Properties properties;

	public Members(Map<String, String> admins, Properties properties) {
		this.admins = admins;
		this.properties = properties;
	}

	public void getMembersDetails() {
		System.out.println("\n" + "=============MEMBERS DETAILS =============" + "\n");
		System.out.println("Email to Admin : "+properties.getProperty("mailtoadmin")+"\n");
		for (Map.Entry<String, String> entry : admins.entrySet()) {
			System.out.println("Admin ID : " + entry.getKey() + " and " + "Admin Name : " + entry.getValue());
		}
	}
}