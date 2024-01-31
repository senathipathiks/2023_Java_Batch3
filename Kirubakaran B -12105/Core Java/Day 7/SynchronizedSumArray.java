package day4multithreading;

class MathCalc{
	synchronized void getSumOfArray(int[] numbers) {
		int sum=0;
		for(int number:numbers) {
			System.out.println(Thread.currentThread().getName()+" adds "+ sum + " to "+number
					+" to get ->"+(sum+=number));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
public class SynchronizedSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathCalc m=new MathCalc();
		Thread threadone=new Thread(()->
		m.getSumOfArray(new int[] {10,11,12}));
		Thread threadtwo=new Thread(()->
		m.getSumOfArray(new int[] {20,21,22}));
		threadone.start();
		threadtwo.start();
		
	}

}
