package com.spring.annot2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.spring.annot2"})
public class Config {

	@Bean
	public Office office() {

		return new Office(1,"Relevantz");
	}
	
	@Bean
	public Staff staff() {
		
		Staff o = new Staff ();
	
		o.setSid(1);
		o.setSname("Prasanth");
		
		return o;
	
	}

}
