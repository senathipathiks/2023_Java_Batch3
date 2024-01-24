package day2j;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=54321;
		int sum=0;
		while(n>0) {
			int r=n%10;
			sum=sum *10+r;
			n=n/10;
			
			
		}
System.out.println(sum);
	}



	}


