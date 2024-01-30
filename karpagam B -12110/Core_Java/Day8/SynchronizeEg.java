package Com.Day8;

class File1{
	
	synchronized void print(int num) throws InterruptedException{ // synchronized keyword tells that first complete one task and go for the next one
		for(int i=num;i>0;i--) {
			System.out.println(i);
		    Thread.sleep(1000);
		}
	}
}
	class ThreadOne extends Thread{
		File1 f1;
		public ThreadOne(File1 f1) {
        this.f1=f1;		
}
		public void run() {
			try {
				f1.print(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	class ThreadTwo extends Thread{
		
		File1 f2;
		public ThreadTwo(File1 f2) {
        this.f2=f2;		
}
		public void run() {
			try {
				f2.print(20);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}


public class SynchronizeEg {

	public static void main(String[] args) {
		File1 f1=new File1();
		ThreadOne obj1=new ThreadOne(f1);
		ThreadTwo obj2=new ThreadTwo(f1);//we have to call f1 becoz we specify that f1 resource should be call first and other will run after executing this
		obj1.start();
		obj2.start();

		
	}

}
