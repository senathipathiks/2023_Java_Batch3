package com.coreday2;

public class Repeatedelements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate) {
                count++;
            }
        }
        System.out.println("Number of repeated elements in given array: " + count);
    }
}
