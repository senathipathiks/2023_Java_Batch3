package CorejavaDay8;

//Finding sum of arrays

class MathCalc{
	synchronized void getSumOfArray(int[] numbers) {
		int sum = 0;
		
		for(int number:numbers) {
			System.out.println(Thread.currentThread().getName()+"adds"+sum +"to"+number +"to get->"+(sum += number));
			
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}

public class SynchronizeEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathCalc mathService = new MathCalc();
		
		Thread threadOne = new Thread(() ->
			mathService.getSumOfArray(new int[] {10,11,12}));
		
		Thread threadTwo = new Thread(() ->
			mathService.getSumOfArray(new int[] {20,21,22}));
		
		threadOne.start();
		threadTwo.start();
	}

}
