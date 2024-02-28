package Day1;
class Calculator {

    int multiply(int num1, int num2) {
        return num1 * num2;
    }
 
    float multiply(float num1, float num2) {
        return num1 * num2;
    }
 
    float multiply(int num1, float num2) {
        return num1 * num2;
    }
 
    float multiply(float num1, int num2) {
        return num1 * num2;
    }
}


public class CalculatorMul {

	public static void main(String[] args) {
		 Calculator C1 =new Calculator();
		 
		 int result1 = C1.multiply(12,45);
		 System.out.println("The  two int type Multiplication value:"+result1);
	
		 float result2 =C1.multiply(result1, 2.5f);
		 System.out.println("The Mixed type multiplacation value:"+result2);
		 
		 float result3 =C1.multiply(result2, 2);
		 System.out.println("The Mixed type multiplacation value:"+result3);
		 	 

	}

}
