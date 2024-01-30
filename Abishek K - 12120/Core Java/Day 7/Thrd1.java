package com.day7;

class File1{
	synchronized void print(int num) {
		for(int i=0;i<=num;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
	}
}
class Thread1 extends Thread{
	File1 f1;
	Thread1(File1 f1){
		this.f1=f1;
	}
	public void run() {
		f1.print(10);
	}
}
class Thread2 extends Thread{
	File1 f2;
	Thread2(File1 f2){
		this.f2=f2;
	}
	public void run() {
		f2.print(20);
	}
}
public class Thrd1 {

	public static void main(String[] args) {
		File1 f1 = new File1();
		Thread1 th1 = new Thread1(f1);
		Thread2 th2 = new Thread2(f1);
		th1.start();
		th2.start();

	}

}
