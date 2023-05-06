package com.spring.ioc.annotation.annotationconfig.bank.dao;

import org.springframework.stereotype.Repository;

@Repository
public class BankDao {
	public void getBankDao() {
		System.out.println("Inside Bank DAO Method");
	}
}