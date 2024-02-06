package com.day8;

class File{
	
  synchronized	void print(int num) throws InterruptedException {
		
		for (int i = num; i >0 ; i--) {
			
			System.out.println(i);
			
			Thread.sleep(1000);
		}
		
	}
	
}

class ThreadA1 extends Thread {
	
	File f1;
	
	public ThreadA1(File f1) {
		
		this.f1=f1;
		
	}
	@Override
	public void run() {
		
		try {
			super.run();
			
			//Thread.sleep(2000);

			f1.print(10);
		} catch (Exception e) {
			e.printStackTrace();
	}
	
}
}


class ThreadA2 extends Thread{
	
	File f2;
	public ThreadA2(File f2) {
		this.f2=f2;
		
	}
	
	@Override
	public void run() {
		
		try {
			super.run();

			f2.print(20);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}



public class SyncEx2 {

	public static void main(String[] args) {
		
		File f = new File();
		
		ThreadA1 a = new ThreadA1(f);
		
		ThreadA2 b = new ThreadA2(f);
		
		a.start();
		b.start();
		
		
	}

}

