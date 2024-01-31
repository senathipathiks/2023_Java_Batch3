package day4multithreading;

class Thread1 extends Thread{
	public void run(){
	for(int i=0;i<5;i++) {
		System.out.println("Thread-1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
class Thread2 extends Thread{
	public void run() {
	
	for(int i=0;i<10;i++) {
		System.out.println("Thread-2");
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}}


public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t=new Thread1();
		Thread2 t1=new Thread2();
		
		t.start();
		t1.start();
	
	t1.setPriority(10);
	
		System.out.println(t.getPriority());
		
	}

}
