package day2j;
//Write a Java program to print numbers between 
//1 and 100 divisible by 3, 5 and both.
public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<100;i++) {
			if(i%3==0&&i%5==0) {
				System.out.println(i+"Divisible by both 3 and 5");
			}
			else if(i%3==0) {
				System.out.println(i+"Divisible by 3");
		}
			else if(i%5==0) {
				System.out.println(i+"Divisible by 5");
		}
		

	}

	}}
