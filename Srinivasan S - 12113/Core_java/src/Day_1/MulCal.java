package Day_1;
/*
 * Create a class named Calculator with Multiplication Operation.
Overload Multiplication method for integer multiplication, float multiplication and 
mixed type multiplication.
 */
public class MulCal {
	
	void multiplication() {
		
	}
	int multiplication(int a,int b) {
		return a*b;
	}
	float multiplication(float a,float b) {
		return a*b;
	}
	float multiplication(float a,int b) {
		return a*b;
	}


	public static void main(String[] args) {
		MulCal m1=new MulCal();
		
		System.out.println(m1.multiplication(2,5));
		System.out.println(m1.multiplication(3f,5.3f));
		System.out.println(m1.multiplication(12.2f,4));
		
		
	}

}
