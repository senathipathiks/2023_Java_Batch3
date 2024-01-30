package core.day6;
class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("thread1");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("thread2");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
		
		
	}
}

public class ThreadPrc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Thread1 th = new Thread1();
      th.setPriority(1);
      th.start();
     
      Thread2 th2=new Thread2();
      th2.start();
      th2.setPriority(5);
      System.out.println(th.getPriority());
      System.out.println(th2.getPriority());
	}

}
