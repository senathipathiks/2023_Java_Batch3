//Create a class named Calculator with Multiplication Operation.
//Overload Multiplication method for integer multiplication, float multiplication and 
//mixed type multiplication.
package Day_1;
class Calculator{
	public int multiply(int a,int b) {
		return a*b;
	}
	public float multiply(float a, float b) {
		return a*b;
	}
	public float multiply1(float a, float b) {
		return a*b;
	}
	
}

public class Multiple_Operation {

	public static void main(String[] args) {
		Calculator obj=new Calculator();
		int Int=obj.multiply(5,3);
		System.out.println("Using Integer: "+Int);
		
		float Float=obj.multiply(5.1f,3.1f);
		System.out.println("Using Float: "+Float);
		
		float Float1=obj.multiply(5,3.1f);
		System.out.println("Using Mixed type: "+Float1);
		
		

	}

}
