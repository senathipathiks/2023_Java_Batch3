package Day7.ClassExamples;

class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i < 9; i++) {
			System.out.println("Thread 1");
			try {
				Thread1.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
	class Thread2 extends Thread {
		public void run() {
			for (int i = 0; i < 9; i++) {
				System.out.println("Thread 2");
				try {
					Thread1.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

public class ThreadEx1 {

	public static void main(String[] args) {
		 Thread1 t1=new Thread1();
		 Thread2 t2=new Thread2();
		// Thread3 t3=new Thread3();
		 t1.start();
		 t2.start();
		 

	}
}
	
