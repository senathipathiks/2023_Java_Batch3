package Day_6;

import java.util.Iterator;

class MathCalc{
	synchronized void getSumOfArray(int[] num) {
		int sum = 0;
		
		 for (int i : num) {
			System.out.println(Thread.currentThread().getName()
					+"  adds  "
					+sum+"  to  "
					+i + "  to get =>  "
					+(sum+=i));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
		 }
	}
}
public class Syncronize2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathCalc m = new MathCalc();
		
		Thread th1 = new Thread(() ->
		m.getSumOfArray(new int[] {10,20,30}));
		
		Thread th2 = new Thread(() ->
		m.getSumOfArray(new int[] {70,60,50}));
		
		th1.start();
		
		th2.start();

	}

}
