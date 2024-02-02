package Day7;

class Thread1 extends Thread{
	public void run() {
	for(int i=0;i<10;i++) {
		System.out.println("Thread-1");
		System.out.print(" ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}

//class Thread2 extends Thread
//{
//	public void run() {
//	for(int i=0;i<10;i++) {
//		System.out.print("Thread-2");
//		System.out.print(" ");
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//}
//}

class Thread3 extends Thread
{
	public void run() {
	for(int i=0;i<10;i++) {
		System.out.println("Thread-3");
		System.out.print(" ");
	}
	
}
}


public class ThreadDemo1 {

	public static void main(String[] args) {
		
		Thread1 th1=new Thread1();
		th1.setPriority(5);
		//		th1.start();
		
//		Thread2 th2=new Thread2();
//		th2.setPriority(6);
		Thread3 th3=new Thread3();
		th3.setPriority(9);
		th1.start();
		
//		th2.start();
		th3.start();
		
		System.out.println(th1.getPriority());
		System.out.println(th3.getPriority());
		
		

	}

}
