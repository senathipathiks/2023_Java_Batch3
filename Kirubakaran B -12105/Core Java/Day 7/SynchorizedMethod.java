package day4multithreading;

class File1{
	synchronized void print(int num) throws InterruptedException {
		for(int i=num;i>0;i--) {
			System.out.println(i);
			Thread.sleep(1000);
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
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class ThreadTwo extends Thread{
	File1 f2;
	ThreadTwo(File1 f2){
		this.f2=f2;
	}
	public void run() {
		try {
			f2.print(20);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class SynchorizedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File1 f1=new File1();
		ThreadOne t1=new ThreadOne(f1);
		ThreadTwo t2=new ThreadTwo(f1);
		t1.start();
		t2.start();
		
		

	}

}
