package Com.Day8;

class MathCalc{
	synchronized void getSumOfArray(int[]numbers) {
		int sum=0;
		for(int number:numbers) {
			System.out.println(Thread.currentThread()
			.getName()
			+ " adds "
			+ sum + " to "
			+ number + " to get-> "
			+ (sum = sum + number));
			
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}

public class SynchronizeEg1 {

	public static void main(String[] args) {
		MathCalc mathService=new MathCalc();
		
		Thread threadone=new Thread(()->
		mathService.getSumOfArray(new int[] {10,20,20,40}));
		
		Thread threadTwo=new Thread(()->
		mathService.getSumOfArray(new int[] {11,12,13}));
		
		threadone.start();
		threadTwo.start();
		
		

	}

}
