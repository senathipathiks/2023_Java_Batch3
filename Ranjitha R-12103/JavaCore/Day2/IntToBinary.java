//Write a Java program to convert an integer number to a binary number.
package Day2;

public class IntToBinary {

	public static void main(String[] args) {
		int num=5;
		String Binary=Integer.toBinaryString(num);
		System.out.println("The binary number of "+num+" is : "+Binary);
	}

}
