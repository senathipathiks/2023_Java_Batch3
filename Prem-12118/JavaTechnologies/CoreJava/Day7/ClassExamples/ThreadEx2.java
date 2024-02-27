package Day7.ClassExamples;

class Thread3 implements Runnable {
	public void run() {
		for (int i = 0; i < 9; i++) {
			System.out.println("Thread 1");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Thread4 implements Runnable {
	public void run() {
		for (int i = 0; i < 9; i++) {
			System.out.println("Thread 2");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}

public class ThreadEx2 {

	public static void main(String[] args) {
		Thread3 t1 = new Thread3();
		Thread4 t2 = new Thread4();
		// Thread3 t3=new Thread3();

		Thread ob1 = new Thread(t1);
		Thread ob2 = new Thread(t2);

		ob1.start();
		ob2.start();

	}
}
