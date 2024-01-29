package Day7.ClassExamples;
class Thread5 implements Runnable{
  public void run(){
	  for(int i=0;i<=50;i++) {
		  System.out.println("Thread 5");
		  
		   
	  }
	}
}
class Thread6 implements Runnable{
	public void run() {
	for(int i=0;i<50;i++) {
		System.out.println("Thread 6");
	}
		
	}
}

public class ThreadEx3 {

	public static void main(String[] args) {
		 
	Thread5 t1=new Thread5();
	Thread6 t2=new Thread6();

	Thread ob1 = new Thread(t1);
	Thread ob2 =new Thread(t2);
	
	ob1.setPriority(6);
	ob2.setPriority(7);
    
	
    System.out.println("Thread 5 Priority: " + ob1.getPriority());
    System.out.println("Thread 6 Priority: " + ob2.getPriority());
	 
	ob1.start();
	ob2.start();

	

	}

}
