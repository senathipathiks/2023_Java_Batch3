package com.abi.qns;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("question.xml");
		
		Question qn = (Question) context.getBean("question");
		qn.display();

	}

}
