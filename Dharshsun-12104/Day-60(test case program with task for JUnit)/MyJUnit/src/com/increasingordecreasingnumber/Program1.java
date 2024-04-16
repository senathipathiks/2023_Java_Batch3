package com.increasingordecreasingnumber;

public class Program1{

//Utility function to check if
//the digits of the current
//integer forms a wave pattern
	public static boolean findIncreasing(int input)
{
	
	// Convert the number to a string
	String S = Integer.toString(input);
    boolean flag=true;
	// Loop to iterate over digits
	for (int i = 0; i < S.length()-1;)
	{
	if(Integer.parseInt(Character.toString(S.charAt(i))) <=(Integer.parseInt(Character.toString(S.charAt(i+1)))))
	{
		i++;
	}
	else
	{
		flag=false;
		break;
	}
	
	}
	return flag;
}
	public static void main (String[] args) {
	    int input = 1330;
	    if(findIncreasing(input) == true)
	      System.out.print("Increasing order");
	    else
	      System.out.print("Failed");
	  }
}
	





