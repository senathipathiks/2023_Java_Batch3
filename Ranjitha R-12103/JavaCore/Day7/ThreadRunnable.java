package Day7;

class Thread11 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread-1");
		}

	}

	public void setPriority(int i) {
		// TODO Auto-generated method stub

	}

}

class Thread22 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread-2");
		}

	}

	public void setPriority(int i) {
		// TODO Auto-generated method stub

	}

}

class Thread33 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread-3");
		}
	}

	public void setPriority(int i) {
		// TODO Auto-generated method stub

	}

}

public class ThreadRunnable {

	public static void main(String[] args) {
		Thread11 obj1 = new Thread11();
		Thread22 obj2 = new Thread22();
		Thread33 obj3 = new Thread33();
		Thread th1 = new Thread(obj1);
		Thread th2 = new Thread(obj2);
		Thread th3 = new Thread(obj3);
		obj1.setPriority(10);
		obj2.setPriority(10);
		obj3.setPriority(5);
//		System.out.println(th1.getPriority());
//		System.out.println(th2.getPriority());
		th1.start();
		th2.start();
		th3.start();

	}

}
