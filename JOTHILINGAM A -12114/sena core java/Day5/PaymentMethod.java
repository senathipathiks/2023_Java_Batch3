package Day5;

import java.util.Scanner;

	
abstract class Payment{
	
	abstract  Void  transact();
}

 class upi extends Payment{

	@Override
	Void transact() {
		System.out.println("Payment succesful ");
		return null;
		
	}

	
}


public class PaymentMethod {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		upi u=new upi();
		
		System.out.println("Select Your Transaction");
		System.out.println("1.UpiPayment\n2.Bank transfer");
		
		int n=sc.nextInt();
		
		switch(n)
		{
		case 1:
			System.out.println("Enter the upi id");
			String id=sc.next();
			System.out.println("Enter the Amount");
			int  amt=sc.nextInt();
			System.out.println("Enter upi pin");
			int pin =sc.nextInt();
			
			if(id != null && amt !=0 && pin !=0 ) {
				
				u.transact();
				}
			else {
				System.out.println(" Transaction Failure ");
			}
			break;
			
		case 2:
					
			
			}
		
		
		
		
		
	}

}
