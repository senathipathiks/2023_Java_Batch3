package Com.Day1;

/*Create a class named Calculator with Multiplication Operation.
Overload Multiplication method for integer multiplication, float multiplication and 
mixed type multiplication.*/

public class Calci {	
	int c;
	float d;
	float e;

	void multiplication() {
		
	}
	  int multiplication(int a,int b) {
		return c= a*b;
	}
	 float multiplication(float a,float b) {
			return d=a*b;
		}
	 float multiplication(int a,float b) {
			return e=a*b;
		}
	 
public static void main(String[] args) {
    Calci obj1=new Calci();
	Calci obj2=new Calci();
	Calci obj3=new Calci();

			
	System.out.println("Integer Multiplication: " +obj1.multiplication(2, 3));
	System.out.println("Float Multiplication: " +obj2.multiplication(2.2f,3.7f));
	System.out.println("Mixed Multiplication: " +obj3.multiplication(2,3.7f));

}

}
