package com.spring.ioc.di.annotation.javabased;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBasedConfiguration {

	@Bean("myDate")
	public Date getMyDateBean() {
		return new Date();
	}
}