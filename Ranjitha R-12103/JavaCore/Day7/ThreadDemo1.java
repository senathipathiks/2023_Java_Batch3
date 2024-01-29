package Day7;

class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread-1");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.err.println("Thread-2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 obj1 = new Thread1();
		obj1.setPriority(10);
		Thread2 obj2 = new Thread2();
		obj1.start();
		obj2.start();
		System.out.println(obj1.getPriority());
		System.out.println(obj2.getPriority());
	}

}
