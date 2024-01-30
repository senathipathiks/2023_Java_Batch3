package core.day5;
 abstract class loan
 {
	 abstract void interst();
 }
  class HousingLoan extends loan
 {
	@Override
	void interst() {
		System.out.println("interst rate is 5");
		
	}
 }
	class PersonalLoan extends loan
	{
		void interst()
		{
			System.out.println("the interset rate is 7");
		}
	}
	class VehicleLoan extends loan
	{
		void interst()
		{
			System.out.println("the interst rate is 8");
		}
	}
 
public class AbstractionClass {

	public static void main(String[] args) {
		VehicleLoan vl = new VehicleLoan();
		vl.interst();
		PersonalLoan pl = new PersonalLoan();
		pl.interst();
		HousingLoan hl = new HousingLoan();
		hl.interst();
		
		
	}

}
