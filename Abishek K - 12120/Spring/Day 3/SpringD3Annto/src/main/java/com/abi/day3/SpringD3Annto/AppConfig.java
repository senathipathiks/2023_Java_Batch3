package com.abi.day3.SpringD3Annto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.abi.day3.SpringD3Annto"})
public class AppConfig {
	
	@Bean(name="student")
	public Exmp1 student() {
		
		return new Exmp1(12120,"Abishek","Namakkal");
	}

}
