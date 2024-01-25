/*vehicle
Two Wheeler
FourWheeler */
package Day4;

class vehicle{
	void noofwheels() {
		System.out.println("All vehicles having wheels");
	}
	void brandname() {
		System.out.println("Its Vary depends on the vehicle");
	}
}
class TwoWheeler extends vehicle{
	void noofwheels() {
		System.out.println("Two wheels");
	}
	void brandname() {
		System.out.println("Honda");
	}
}
class FourWheeler extends vehicle{
	void noofwheels() {
		System.out.println("Four wheels");
	}
	void brandname() {
		System.out.println("Toyato");
	}
}
public class InheritVehicle {

	public static void main(String[] args) {
		vehicle obj1=new vehicle();
		obj1.noofwheels();
		
		vehicle obj2=new TwoWheeler();
		obj2.noofwheels();
		obj2.brandname();
		
		vehicle obj3=new FourWheeler();
		obj3.noofwheels();
		obj3.brandname();
		

	}

}
