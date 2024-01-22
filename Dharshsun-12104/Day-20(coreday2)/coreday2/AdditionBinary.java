package com.coreday2;

import java.util.Scanner;

public class AdditionBinary
{
   public static void main(String[] args)
   {
      long binaryOne, binaryTwo;
      int remOne, remTwo, sumDigit, i=0, carry=0;
      int[] sum = new int[10];
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the First Binary Number: ");
      binaryOne = sc.nextLong();
      System.out.print("Enter the Second Binary Number: ");
      binaryTwo = sc.nextLong();
      
      while(binaryOne!=0 || binaryTwo!=0)
      {
         remOne = (int)(binaryOne%10);
         remTwo = (int)(binaryTwo%10);
         sumDigit = remOne + remTwo + carry;
         sum[i] = (int)(sumDigit%2);
         carry = (int)(sumDigit/2);
         binaryOne = binaryOne/10;
         binaryTwo = binaryTwo/10;
         i++;
      }
      if(carry==1)
         sum[i] = carry;
      System.out.print("\nResult = ");
      while(i>=0)
      {
         System.out.print(sum[i]);
         i--;
      }
   }
}
