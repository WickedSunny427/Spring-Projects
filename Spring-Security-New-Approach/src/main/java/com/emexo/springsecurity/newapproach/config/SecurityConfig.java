package com.emexo.springsecurity.newapproach.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	//Password Encoder
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	//Managing Users and Roles
	@Bean
	public UserDetailsService userDetailsService() {
		
		UserDetails normalUser=User
				.withUsername("normal")
				.password(passwordEncoder().encode("normal"))
				.roles("NORMAL")
				.build();
		
		UserDetails adminlUser=User
				.withUsername("admin")
				.password(passwordEncoder().encode("admin"))
				.roles("ADMIN")
				.build();
		
		return new  InMemoryUserDetailsManager(normalUser,adminlUser);
	}
	
	//Managing URL's and their permissions.
	@Bean
	public SecurityFilterChain  filterChain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable()
		.authorizeHttpRequests()
		
		.requestMatchers("/home/admin")
		.hasRole("ADMIN")
		
		.requestMatchers("/home/normal")
		.hasRole("NORMAL")
		
		.requestMatchers("/home/public")
		.permitAll()
		.anyRequest()
		.authenticated()
		.and().
		formLogin();
		
		return httpSecurity.build();
	}
}
