package com.abi.scope2;



//Life-Cycle of the Bean
public class Student {
	
	private int sid;
	private String sname;
	private String scity;
	
	public Student() {
		System.out.println("Bean Created");
	}
	
	public void init() {
		System.out.println("I am in init() - Method");
	}
	
	public void app() {
		System.out.println("Application Output");
	}
	
	public void destroy() {
		System.out.println("I am in destroy() - Method");
	}

}
