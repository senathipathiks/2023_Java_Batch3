package core.day5;

interface loan1 {
	void intrest1();

	void interst1();
}

class HousingLoan1 implements loan1 {
	@Override
	public void interst1() {
		System.out.println("interst rate is 5");

	}

	@Override
	public void intrest1() {
		// TODO Auto-generated method stub

	}
}

class PersonalLoan1 implements loan1 {
	public void interst1() {
		System.out.println("the interset rate is 7");
	}

	@Override
	public void intrest1() {
		// TODO Auto-generated method stub

	}
}

class VehicleLoan1 implements loan1 {
	public void interst1() {
		System.out.println("the interst rate is 8");
	}

	@Override
	public void intrest1() {
		// TODO Auto-generated method stub

	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		VehicleLoan1 vl1 = new VehicleLoan1();
		vl1.interst1();
		HousingLoan1 hl1=new HousingLoan1();
		hl1.interst1();
		PersonalLoan1 pl1=new PersonalLoan1();
		pl1.interst1();

	}

}
