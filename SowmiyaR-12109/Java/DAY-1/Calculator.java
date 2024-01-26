package Day1;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int num1;
		int num2;
		int result = 0;
		char operator;
		System.out.println("Calculator application");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		num1=sc.nextInt();
	    System.out.println("Enter the 2nd number:");

	    num2=sc.nextInt();
	    System.out.println("Enter the operator(+,-,*,/)");
	    operator=sc.next().charAt(0);
	    
	    switch(operator) {
	    case '+':
	    	result=num1+num2;
	    	break;
	    case '-':
	    	result=num1-num2;
	    	break;
	    case '*':
	    	result=num1*num2;
	    	break;
	    case '/':
	    	result=num1/num2;
	    	break;
	    
	    default:
	    	System.out.println("Error");
	    }
	    System.out.println("Total:"+num1+""+operator+""+num2+"="+result);
	   
	    
	    
		

	}

}
