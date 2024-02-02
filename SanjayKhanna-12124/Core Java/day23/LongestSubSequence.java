package com.day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LongestSubSequence {
	public static List<Integer> findLongestSubsequence(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new ArrayList<Integer>();
        }

        int[] dp = new int[arr.length];
        int maxLen = 1;
        int lastIndex = 0;

        dp[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                lastIndex = i;
            }
        }

        List<Integer> result = new ArrayList<Integer>();
        int temp = arr[lastIndex];
        int currentLen = maxLen;
        for (int i = lastIndex; i >= 0 && currentLen > 0; i--) {
            if (dp[i] == currentLen && arr[i] <= temp) {
                result.add(arr[i]);
                temp = arr[i];
                currentLen--;
            }
        }
        Collections.reverse(result);
        return result;
    }


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Array Size :");
		 int size = sc.nextInt();
		 int arr[] = new int[size];
		 System.out.println("Enter Array Element :");
		 for(int i=0;i<size;i++) {
			 arr[i]=sc.nextInt();
		 }
		 System.out.println("Array: " + Arrays.toString(arr));
	     System.out.println("Longest Increasing Subsequence: " + findLongestSubsequence(arr));
	    sc.close();
	     
	}

}
