package Com.Day7;

//Thread creation using runnable interface

class Thread3 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread-3");
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			}
	}

	public void setPriority(int i) {
		// TODO Auto-generated method stub
		
	}
}
class Thread4 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread-4");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

	public void setPriority(int i) {
		// TODO Auto-generated method stub
		
	}
}
class Thread5 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread-5");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

	public void setPriority(int i) {
		// TODO Auto-generated method stub
		
	}
}




public class ThreadCreation1 {

	public static void main(String[] args) {
		Thread3 obj1=new Thread3();
		Thread4 obj2=new Thread4();
		Thread5 obj3=new Thread5();


		Thread th1=new Thread(obj1); // If you are not extending the Thread class, your class object would not be treated as a thread object. So you need to explicitly create the Thread class object. We are passing the object of your class that implements Runnable so that your class run() method may execute.
		Thread th2=new Thread(obj2);
		Thread th3=new Thread(obj3);
		
		obj1.setPriority(2);
        obj2.setPriority(10);
        obj3.setPriority(5);
		
		th1.start();
		th2.start();
		th3.start();

		

	}

}
