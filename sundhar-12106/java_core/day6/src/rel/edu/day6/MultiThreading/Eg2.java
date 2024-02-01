package rel.edu.day6.MultiThreading;

class Thread11 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Im thread from 1 : " +i);
		}
	}
	
}

class Thread12 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Im thread from 2 : " +i);
		}
	}
	
}

class Thread13 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Im thread from 3 : " +i);
		}
	}
	
}

public class Eg2 {
	
	public static void main(String[] args) {
		
		Thread11 t1 = new Thread11();
		Thread12 t2 = new Thread12();
		Thread13 t3 = new Thread13();
		
		Thread ob1 = new Thread(t1);
		Thread ob2 = new Thread(t2);
		Thread ob3 = new Thread(t3);
		
		ob1.start();
		ob2.start();
		ob3.start();
	}

}
