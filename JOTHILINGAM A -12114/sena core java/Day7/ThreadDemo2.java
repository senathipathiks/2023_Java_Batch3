package Day7;

class Thread11 implements Runnable{
	public void run() {
	for(int i=0;i<10;i++) {
		System.out.print("Thread-1");
		System.out.println(" ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}

class Thread22 implements Runnable
{
	public void run() {
	for(int i=0;i<10;i++) {
		System.out.print("Thread-2");
		System.out.println(" ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
}

class Thread33 implements Runnable
{
	public void run() {
	for(int i=0;i<10;i++) {
		System.out.print("Thread-3");
		System.out.println(" ");
	}
	
}
}


public class ThreadDemo2 {

	public static void main(String[] args) {
		
		Thread11 th1=new Thread11();
		Thread22 th2= new Thread22();
		
		Thread obj1= new Thread(th1);
		Thread obj2= new Thread(th2);
		obj1.setPriority(3);
		obj2.setPriority(10);
	obj1.start();
	obj2.start();
		
		
		

	}

}
