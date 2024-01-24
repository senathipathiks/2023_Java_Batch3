package rel.day3.array;

public class PrimeNumberArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };

		String prime = "";
		String non_prime = "";
		int it = 2;
		boolean b = true;

	
		for(int i=0; i<arr.length; i++){
	        boolean isPrime = true;
	        
	        //check to see if the numbers are prime
	        for (int j=2; j<arr[i]; j++){
	            
	            if(arr[i]%j==0){
	                isPrime = false;
	                non_prime += arr[i];
	                break;
	            }
	        }
	        //print the number
	        if(isPrime)
	        	prime += arr[i];
	    }
		
		System.out.println("prime numbers : "+prime);
		System.out.println("non_prime numbers : "+non_prime);
	}

}
