package Day8;

class MathCalc {
	void getSumOfArray(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			System.out.println(
					Thread.currentThread().getName() + "adds" + sum + "to" + number + "to get->" + (sum += number));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}

public class SynchorizedEx2 {

	public static void main(String[] args) {
		
		MathCalc mathservice = new MathCalc();
		Thread threadOne = new Thread(() -> mathservice.getSumOfArray(new int[] { 10, 11, 12 }));
		Thread threadTwo = new Thread(() -> mathservice.getSumOfArray(new int[] { 20, 21, 22 }));
		threadOne.start();
		threadTwo.start();

	}

}
