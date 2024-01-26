package com.coreday3;
//finding prime nos of array using ternary operator.
public class PrimeNosArray
{
	public static void main(String[] args)
	{
		int i = 0;
		int j = 0;
		int flag = 0;
 
		int a[] = {3, 12, 21, 11, 71, 96, 19, 41, 83, 100};
 
		for (i = 0; i < a.length; i++)
		{
			flag = 0;
			for (j = 2; j < a[i] / 2; j++)
			{
				if (a[i] % j == 0)
				{
					flag = 1;
					break;
				}
			}
			System.out.println(a[i]+" - "+(flag == 0 ? "Prime" : "Not Prime"));
		}
		System.out.println();
	}
}
