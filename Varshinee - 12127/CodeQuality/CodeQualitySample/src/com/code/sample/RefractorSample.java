package com.code.sample;

public class RefractorSample {
	 int num1 = 0;
     int num2 = 1;

	public  void Fibonacii(int limit) {

		extracted(limit);
        extracted(limit);
        extracted(limit);
           
    }

	private void extracted(int limit) {
		while (num2 < limit) {
        	System.out.print(num2+" ");
            num2= num2+num1;
            num1=num2-num1;
        }
	}
    

}
