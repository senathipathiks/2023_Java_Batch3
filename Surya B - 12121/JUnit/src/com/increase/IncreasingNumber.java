package com.increase;

public class IncreasingNumber {

	public int findNum(int num) {
		
		int value = 1;

		
		
		while (num > 0) {
			int first = num % 10; 
			num = num / 10;  
			
            int currentDigit = num % 10;  
            num = num / 10;  
            
           
            while (num > 0) {
                if (currentDigit <= num % 10) { 
                    value = 0; 
                }
                currentDigit = num % 10;  
                num = num / 10; 
            }

           
		
	}
		return value;
	}
}
