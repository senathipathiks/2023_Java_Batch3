package day2j;

public class IntegerToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int index=0;
		int bin[]= new int[40];
		while(n>0) {
			bin[index++]= n%2;
			n = n/2;
			
		}
		for (int i = index-1; i>=0; i--) {
			
			System.out.print(bin[i]);
			
		}
		System.out.println();

	}

}
