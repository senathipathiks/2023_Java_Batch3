package rel.edu.day7.MulThreading;

class File1{
	synchronized void print(int num) throws InterruptedException {
		for (int i = num; i > 0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}

class MyThread1 extends Thread{
	File1 f1;
	public MyThread1(File1 f1) {
		this.f1 = f1;
	}
	@Override
	public void run() {
		try {
			f1.print(20);
//			System.out.println("Hello");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}


class MyThread2 extends Thread{
	File1 f2;
	public MyThread2(File1 f2) {
		this.f2 = f2;
	}
	@Override
	public void run() {
		try {
			f2.print(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

public class SynchronizationDriver {
	
	public static void main(String[] args) {
		
		File1 f1 = new File1();
		
		MyThread1 t1 = new MyThread1(f1);
		MyThread2 t2 = new MyThread2(f1);
		
		t1.start();
		t2.start();
	}

}
