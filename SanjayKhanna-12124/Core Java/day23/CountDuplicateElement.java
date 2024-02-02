package com.day23;

import java.util.HashMap;
import java.util.Scanner;

public class CountDuplicateElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter Array Size :");
        int size = sc.nextInt();
        System.out.println("Enter Array Element :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int i = 0; i < size; i++) {
            if (count.containsKey(arr[i])) {
                count.put(arr[i], count.get(arr[i]) + 1);
            } else {
                count.put(arr[i], 1);
            }
        }
        int numDuplicates = 0;
        for (int key : count.keySet()) {
            if (count.get(key) > 1) {
                numDuplicates++;
            }
        }
        System.out.println("Count of duplicate elements: " + numDuplicates);
        sc.close();
    }
}