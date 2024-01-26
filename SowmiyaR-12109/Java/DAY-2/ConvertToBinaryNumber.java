package Day2;
//7. Write a Java program to convert an 
//integer number to a binary number.
public class ConvertToBinaryNumber {

	public static void main(String[] args) {
		int num=9;
		String binary=Integer.toBinaryString(num);
		System.out.println("the binary number "+num+" is: "+binary);

	}

}
