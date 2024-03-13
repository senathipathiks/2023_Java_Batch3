package com.day3;
import org.springframework.context.annotation.*;
@Configuration 
@ComponentScan(basePackages= {"com.day3"})
public class Config {
@Bean(name="person1")
public Person genPerson() 
{
	return new Person(1,"Balu");
}
@Bean(name="c1")
public Customer genCustomer() {
	Customer c1 = new Customer();
	c1.setId(10);
	c1.setPerson(genPerson());
	return c1;
}
}
