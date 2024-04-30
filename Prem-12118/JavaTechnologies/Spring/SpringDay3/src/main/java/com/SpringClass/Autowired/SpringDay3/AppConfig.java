package com.SpringClass.Autowired.SpringDay3;
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;
	 
	@Configuration
	@ComponentScan(basePackages = "com.SpringClass.Autowired.SpringDay3") //informing spring container to take annotation
	public class AppConfig {
			@Bean(name="per1")
			public Person genPerson()
			{
				return new Person();
			}
	 
	}