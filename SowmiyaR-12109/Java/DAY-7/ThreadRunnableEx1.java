package Day7;

class ThreadEx1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<50;i++) 
       System.out.println("Thread 1");
//		try {
//			Thread.sleep(1000);
//		}
//		catch(InterruptedException e){
//			e.printStackTrace();
//		}
	}
} 

class ThreadEx2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<50;i++) 
			System.out.println("Thread 2");
//		try {
//			Thread.sleep(1000);
//		}
//		catch(InterruptedException e){
//			e.printStackTrace();
//		}
	}
}
class Thread33 implements Runnable
{
	public void run()
	{
		for(int i=0;i<50;i++)
			System.out.println("Thread-3");
	}
}

public class ThreadRunnableEx1 {

	public static void main(String[] args)throws InterruptedException {
		ThreadEx1 th1=new ThreadEx1();
		ThreadEx2 th2=new ThreadEx2();
		Thread33 th3=new Thread33();
		Thread obj1=new Thread(th1);
		Thread obj2=new Thread(th2);
		Thread obj3=new Thread(th3);
		obj1.setPriority(1);
		obj2.setPriority(5);
		obj3.setPriority(10);
//		System.out.println(obj1.getPriority());
//		System.out.println(obj2.getPriority());
//		System.out.println(obj3.getPriority());
		
		obj1.start();
		obj2.start();
		obj3.start();
	
	}

}

