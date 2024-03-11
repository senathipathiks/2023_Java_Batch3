package com.employeeApp.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan({ "com.employeeApp.controller" })
public class Config extends WebMvcConfigurationSupport {

	@Bean
	public InternalResourceViewResolver viewResolver() {

		System.out.println("hello");

		InternalResourceViewResolver vr = new InternalResourceViewResolver("WEB-INF/views/", ".jsp");
		return vr;

	}

}
