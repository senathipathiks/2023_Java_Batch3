package day2j;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for (int j = 1; j < 5; j++) {
			
		for (int i=1;i<j;i++) {
			if(j%i==0)
				count++;
		
		}
		if(count==2) {
			System.out.println("prime :"+j);
		}else {
			System.out.println("not prime :"+j);
		}
		}
	}

}
