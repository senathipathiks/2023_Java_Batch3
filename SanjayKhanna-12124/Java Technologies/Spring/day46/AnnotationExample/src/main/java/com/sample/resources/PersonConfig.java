package com.sample.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sample.bean.Person;

@Configuration
public class PersonConfig {
	
	@Bean(name="p1")
	public Person person() {
		return new Person(1, "SanjayKhanna");
	}

}
