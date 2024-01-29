package Day_6;

/*
 * Method reference 3 types :
 * 1.static method
 * 2.instance method(using object we can do operation)
 * 3.constructor
 * Method references through static method
 * syntax interface name ref variable=Class name  :: method name(in class);
 */
interface Drawing{
	void draw();
}

public class MethodReferrences1 {

	public static void construct() {
		System.out.println("Construction under process...");
	}
	public static void main(String[] args) {
		Drawing obj=MethodReferrences1 :: construct;//creating method references
		obj.draw();// referring or calling abstract mthd in interface
	}

}
