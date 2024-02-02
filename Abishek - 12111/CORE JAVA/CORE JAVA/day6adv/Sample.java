package com.day6adv;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Array";
		int a []= {2,4,5,6,7};
		int b =10;
		int c ;
//		System.out.println(c);
		try {
			c = b/a[5];
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
