package day_7;

class Threadd1 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("Thread 1");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}	
}

class Threadd2 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <50; i++) {
			System.out.println("Thread 2");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}		
	}	
}

class Threadd3 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <50; i++) {
			System.out.println("Thread 3");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}		
	}	
}

public class ThreadEg2 {

	public static void main(String[] args) {
		Threadd1 t1=new Threadd1();
		Threadd2 t2=new Threadd2();
		Threadd3 t3=new Threadd3();
		
		Thread obj1=new Thread(t1);
		Thread obj2=new Thread(t2);
		Thread obj3=new Thread(t3);
		obj1.setPriority(6);
		obj2.setPriority(2);
		obj3.setPriority(10);
		obj1.start();
		obj2.start();
		obj3.start();
		
		System.out.println(obj1.getPriority());
		System.out.println(obj2.getPriority());
		System.out.println(obj3.getPriority());
		
		
		

	}

}
