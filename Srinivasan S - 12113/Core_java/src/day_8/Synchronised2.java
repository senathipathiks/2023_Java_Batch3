package day_8;



class MathCalc{
	synchronized void getSumOfArray(int []numbers) {
		int sum=0;
		for (int number : numbers) {
			System.out.println(Thread.currentThread().getName()+
					" adds"+sum+" to"+number+
					" to get ->"+(sum+=number));
			
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

public class Synchronised2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathCalc m1=new MathCalc();
		
		Thread t1=new Thread(()->m1.getSumOfArray(new int[] {10,11,12}));
		
		Thread t2=new Thread(()-> m1.getSumOfArray(new int[] {20,21,23}));
		
		t1.start();
		t2.start();

	}

}
