package rel.edu.day7.MulThreading;

class MathCalc{
	
	synchronized void getSumOfArray(int [] num) {
		int sum = 0;
		for (int i : num) {
			System.out.println(Thread.currentThread().getName()+ " adds "+sum+" to "+i+" to get "+(sum += i));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class SyncThread2 {
	
	public static void main(String[] args) {
		
		MathCalc mathServ = new MathCalc();
		
		Thread threadOne = new Thread(()->mathServ.getSumOfArray(new int[] {10,11,12}));
		Thread threadTwo = new Thread(()->mathServ.getSumOfArray(new int[] {20,21,22}));
		
		threadOne.start();
		threadTwo.start();
	}

}
