package com.coreday1;
import java.util.Scanner;

class StudentApplication {

   public static void main(String args[]) {
        int mark[] = new int[5];
        int i;
        float sum=0, avg;
        String grade;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for 5 Subjects : ");
        for(i=0; i<5; i++) {
            mark[i] = sc.nextInt();
            sum = sum + mark[i];
        }
        avg = sum/5;

        if(avg>=94)
            grade = "A";
        else if(avg>=90 && avg<94)
            grade = "A-";
        else if(avg>=87 && avg<90)
            grade = "B+";
        else if(avg>=83 && avg<87)
            grade = "B";
        else if(avg>=80 && avg<83)
            grade = "B-";
        else if(avg>=77 && avg<80)
            grade = "C+";
        else if(avg>=73 && avg<77)
            grade = "C";
        else if(avg>=70 && avg<73)
            grade = "C-";
        else if(avg>=67 && avg<70)
            grade = "D+";
        else if(avg>=63 && avg<67)
            grade = "D";
        else if(avg>=60 && avg<63)
            grade = "D-";
        else
            grade = "F";

        System.out.println("Total Marks = " + sum);
        System.out.println("Average Marks = " + avg);
        System.out.println("Grade = " + grade);
    }
}
