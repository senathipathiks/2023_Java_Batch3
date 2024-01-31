package day4multithreading;

class Thread11 implements Runnable{
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
class Thread22 implements Runnable{
	public void run() {
	
	for(int i=0;i<10;i++) {
		System.out.println("Thread-2");
//	try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		}}}
public class ThreadWay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread11 t=new Thread11();
		Thread22 t1=new Thread22();
		Thread ob1=new Thread(t);
		Thread ob2=new Thread(t1);
		ob1.start();
		ob2.start();
		ob2.setPriority(8);
	}

}
