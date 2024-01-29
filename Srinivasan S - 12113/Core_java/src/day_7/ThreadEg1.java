package day_7;

class Thread1 extends Thread {
	
		public void run()  {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread 1");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
	
}

class Thread2 extends Thread{
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.err.println("Thread 2");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

public class ThreadEg1 {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		t1.start();
		t1.setPriority(10);
		Thread2 t2=new Thread2();
		t2.start();
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());

	}

}
