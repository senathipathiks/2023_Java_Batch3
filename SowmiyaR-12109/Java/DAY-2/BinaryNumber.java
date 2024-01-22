package Day2;
//6. Write a Java program to add two binary numbers.
public class BinaryNumber {

	public static void main(String[] args) {
		String num1="1010";
		String num2="10";
		int decimal1=Integer.parseInt(num1,2);
		int decimal2=Integer.parseInt(num2,2);
		int result=decimal1+decimal2;
		String binarysum=Integer.toBinaryString(result);
		System.out.println("sum of "+num1+ " and "+num2+" is:"+binarysum);
		

	}

}
