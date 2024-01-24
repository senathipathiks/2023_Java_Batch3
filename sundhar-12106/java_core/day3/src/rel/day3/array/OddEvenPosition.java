package rel.day3.array;

public class OddEvenPosition {
	
	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 8, 9 };
		
		String even = "";
		String odd = "";
		
		for (int i : arr) {
			if (i%2 == 0) 
				even += i;
			else
				odd += i;
			
		}
		System.out.println("Even values : "+even);
		System.out.println("Odd values : "+odd);
	}

}
