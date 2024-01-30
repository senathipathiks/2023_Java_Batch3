package day_8;

class File1{
	synchronized void print(int sum) throws InterruptedException {
		for (int i = sum; i >0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}

class Threadone extends Thread{
	File1 f1;
	public Threadone(File1 f1) {
		// TODO Auto-generated constructor stub
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

class Threadtwo extends Thread{
	File1 f2;

	public Threadtwo(File1 f2) {
//		super();
		this.f2 = f2;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			f2.print(20);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

public class Synchronised1 {

	public static void main(String[] args) {
		File1 f1=new File1();
		Threadone t1=new Threadone(f1);
		Threadtwo t2=new Threadtwo(f1);
		t1.start();
		t2.start();

	}

}
