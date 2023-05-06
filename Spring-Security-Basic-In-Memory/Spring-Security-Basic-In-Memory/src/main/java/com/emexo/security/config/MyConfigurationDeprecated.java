package com.emexo.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/*
 * From Spring Boot 2.7, WebSecurityConfigurerAdapter is deprecated. 
 */

/*
@Configuration
@EnableWebSecurity
public class MyConfigurationDeprecated extends WebSecurityConfigurerAdapter {
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.inMemoryAuthentication()
		.withUser("javainuse").
		password("javainuse").
		roles("USER");
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http
		.antMatcher("/**").
		authorizeRequests().
		anyRequest().
		hasRole("USER").
		and().
		formLogin()
			.loginPage("/login.jsp")
			.failureUrl("/login.jsp?error=1")
			.loginProcessingUrl("/login")
			.permitAll()
			.and()
				.logout().
				logoutSuccessUrl("/listEmployees.html");
	}
}
*/