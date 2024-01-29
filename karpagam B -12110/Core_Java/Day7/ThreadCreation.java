package Com.Day7;

//thread creation by extending the thread class

class Thread1 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread-1");
			try {  // to suspend or sleep that function for a certain millisecond
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread1{
	public void run() {
		for(int i=0;i<10;i++) {
			System.err.println("Thread-2");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class ThreadCreation {

	public static void main(String[] args) {
           Thread1 obj1=new Thread1();
           obj1.start();
          
           Thread2 obj2=new Thread2();
           obj2.start();
           
           obj1.setPriority(2);//-->it executes second based on the priority
           obj2.setPriority(8);//-->it executes first based on the priority
           
           System.out.println(obj1.getPriority()); // normal priority value is 5,maximum priority is 10
           System.out.println(obj2.getPriority()); 


           
           
           
           
	}

}
