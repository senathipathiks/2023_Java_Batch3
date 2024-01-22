package Day2;
//8. Write a Java program to print numbers between 
//1 and 100 divisible by 3, 5 and both.
public class DivisibleNumbers {

	public static void main(String[] args) {
		System.out.println("Divisible by 3 is:");
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
//				
				System.out.println(i);
			}
			}
		  System.out.println("Divisible by 5 id: ");
		  for(int i=1;i<=100;i++) {
			  if(i%5==0) {
				  System.out.println(i);
			  }
		  }
		  System.out.println("Divisible by both 3 And 5 is :");
		  for(int i=1;i<=100;i++) {
			  if(i%3==0 && i%5==0) {
				  System.out.println(i);
			  }
		  }

	}

}
