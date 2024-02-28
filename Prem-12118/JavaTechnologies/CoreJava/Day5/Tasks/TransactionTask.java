package Day5.Tasks;
import java.util.*;

abstract class Payment{
	abstract void trans();
}
class UpiPayment extends Payment{
	void trans() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to send through upi Payment");
		float amt =sc.nextFloat();
		System.out.println("The Amount"+amt+" transfered successfully");
		 
	}
}
class BankPayment extends Payment{
	 void trans() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to be send in Bank transfer");
		float amt =sc.nextFloat();
		System.out.println("The Amount"+amt+" transfer successfully");
		sc.close();
		
	}
}

public class TransactionTask {

	public static void main(String[] args) {
		 
		Payment obj1= new UpiPayment();
		obj1.trans();
		Payment obj2= new BankPayment();
		obj2.trans();
		

	}

}
