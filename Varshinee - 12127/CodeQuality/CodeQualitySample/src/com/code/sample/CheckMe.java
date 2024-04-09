package com.code.sample;

public class CheckMe {
	
	
	public  void Fibonaci(int limit) {

        int num1 = 0;
        int num2 = 1;
 
        while (num2 < limit) {
        	System.out.print(num2+" ");
            num2= num2+num1;
            num1=num2-num1;
        }
           
    }
    public static void main(String[] args) {
		
    	CheckMe k=new CheckMe();
    	k.Fibonaci(200);
	}
}