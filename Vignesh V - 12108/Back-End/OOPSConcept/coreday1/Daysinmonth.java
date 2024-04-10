package com.coreday1;

import java.util.Scanner;

public class Daysinmonth{
    public static void main(String[] args) {
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        month = sc.nextInt();
        int days = getDaysInMonth(month);
        if (days == -1) {
            System.out.println("Invalid month entered.");
        } else {
            System.out.println("Number of days in month " + month + ": " + days);
        }
    }

    public static int getDaysInMonth(int month) {
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                return 31;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            case 2: // February
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the year: ");
                int year = sc.nextInt();
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }
}

