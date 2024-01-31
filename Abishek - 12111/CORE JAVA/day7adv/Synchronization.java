package com.day7adv;
class File1
{
	synchronized void print(int num) throws InterruptedException
	{
		for(int i=num; i>0;i--)
		{
			System.out.println(i);
			Thread.sleep(1000);
		
		}
	}
}
class Thread1 extends Thread
{
	File1 f1;
	Thread1(File1 f1)
	{
		this.f1=f1;
	}
	public void run()
	{
		try {
			f1.print(10);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
class Thread2 extends Thread
{
	File1 f2;
	Thread2(File1 f2)
	{
		this.f2=f2;
	}
	public void run()
	{
		try {
			f2.print(20);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File1 f1 = new File1();
		Thread1 th1 = new Thread1(f1);
		Thread2 th2 = new Thread2(f1);
		th1.start();
		th2.start();
		
	}

}
