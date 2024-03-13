package com.Day7;
class Employee1 extends Thread{
	Employee1(String tname){
		super(tname);
	}
	@Override
	public void run() {
		System.out.println("hello"+Thread.currentThread().getName()+"---"+Thread.currentThread().getId());
	}
}
class Employee2 extends Thread{
	Employee2(String name){
		super(name);
	}
	@Override
	public void run() {
		System.out.println("hii"+Thread.currentThread().getName()+"---"+Thread.currentThread().getId());
	}
}
public class Test {
	public static void main(String[] args) {
		Employee1 t1 = new Employee1(" H1");
		t1.start();
		Employee2 t2 = new Employee2(" H2") ;
		t2.start();
		System.out.println(Thread.activeCount());
	}
}
