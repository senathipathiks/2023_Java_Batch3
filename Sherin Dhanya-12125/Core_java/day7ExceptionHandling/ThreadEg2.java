package com.day7ExceptionHandling;
class Threads1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++) {
			System.out.println("Thread -1");
		
	}
}}
class Threads2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++) {
			
			System.out.println("Thread -2");
	
	}
}}
public class ThreadEg2 {

	
		public static void main(String[] args) throws InterruptedException{
			Threads1 ths1= new Threads1();
			Threads2 ths2= new Threads2();
			Thread obj1=new Thread(ths1);
			Thread obj2=new Thread(ths2);
			System.out.println(obj1.getPriority());
			System.out.println(obj2.getPriority());
			obj1.start();
			obj2.start();
				}

	}


