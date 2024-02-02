package Day8;


class MathCalc{
	synchronized void getSumOfArray(int[] numbers) {
		int sum=0;
		
		for(int number : numbers) {
			System.out.println(Thread.currentThread()
					.getName()
					+ " adds "
					+sum+ " to "
					+ number + " to get -> "
					+(sum+= number));
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}
}

public class SynchronizedMethod2 {

	public static void main(String[] args) {
	
		MathCalc m=new MathCalc();
		
		Thread t1=new Thread(() ->
			m.getSumOfArray(new int [] {10,11,12}));
		
		Thread t2=new Thread(() ->
		m.getSumOfArray(new int [] {20,21,22}));
		
		t1.start();
		t2.start();

	}

}
