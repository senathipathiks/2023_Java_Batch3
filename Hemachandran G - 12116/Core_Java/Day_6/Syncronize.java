package Day_6;

class File1{
	synchronized void print(int a) throws InterruptedException{
		for(int i=a;i>0;i--) {
			System.out.println(i);
			Thread.sleep(500);
		}
	}
}

class ThreadOne extends Thread{
	File1 f1;
	ThreadOne(File1 f1){
		this.f1=f1;
	}
	
	public void run() {
		try {
			f1.print(10);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

class ThreadTwo extends Thread{
	File1 f2;
    ThreadTwo(File1 f2) {
    	this.f2=f2;
		// TODO Auto-generated constructor stub
	}
    
    public void run() {
		try {
			f2.print(20);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}		
	}
}

public class Syncronize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File1 f1 = new File1();
		ThreadOne th1 = new ThreadOne(f1);
		ThreadTwo th2 = new ThreadTwo(f1);
		
		th1.start();
		th2.start();

	}

}
