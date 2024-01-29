package Day7;
class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++) {
       System.out.println("Thread 1");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
} }

class Thread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++) {
			System.out.println("Thread 2");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
}
public class ThreadDemoEx1 {

	public static void main(String[] args)throws InterruptedException {
		Thread1 th1=new Thread1();
		th1.setPriority(10);
		
		Thread2 th2=new Thread2();
//		th2.setPriority(10);
		th1.start();
		th2.start();
		System.out.println(th2.getPriority());
		System.out.println(th1.getPriority());

	}

}
