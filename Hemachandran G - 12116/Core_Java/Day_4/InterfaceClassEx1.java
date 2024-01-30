package Day_4;


interface  Loann{
	 void interest(); 
	
}

class PersonalLoann implements Loann{
	public void interest() {
		System.out.println("Interest Rate is: 8.0");
	}
}

class HouseLoann implements Loann{
	public void interest() {
		System.out.println("Interest Rate is: 15.0");
	}
}

class VehicleLoann implements Loann{
	
	public void interest() {
		
		System.out.println("Interest Rate is: 11.0");
	}
}

public class InterfaceClassEx1 {

	public static void main(String[] args) {

		
		Loann l = new PersonalLoann();
		System.out.println("The Interest Rate Of Personal Loan Is :");
		l.interest();
		System.out.println();
		
		Loann l1 = new HouseLoann();
		System.out.println("The Interest Rate Of House Loan Is :");
		l1.interest();
		System.out.println();
		
		Loann l2 = new VehicleLoann();
		System.out.println("The Interest Rate Of Vehicle Loan Is :");
		l2.interest();

	}

}
