package com.coreday1;

import java.util.Scanner;

public class Inttobinarynumbers {

    public static void main(String[] args) {
        // int to binary
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number to convert : ");
        
        int in = sc.nextInt(); //17
        
        
        int[] binary = new int[40];
        int id = 0;
        while (in > 0) {//17 8
          binary[id++] = in % 2;//1 0 0 0 1
          in = in / 2;
        }
        System.out.print("Binary representation is ");
        for (int i = id - 1; i >= 0; i--)
          System.out.print(binary[i] + "");
            
        }
        
    
    }

