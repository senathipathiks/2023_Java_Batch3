package com.java3;

import java.util.Stack;

public class StackMaxMin {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        //Stack<Integer> m = new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        int max = s.get(0);
        for (int i = 0; i < s.size(); i++) {
            for (int j = i; j < s.size(); j++) 
            if (max <= s.get(i)) {
                max = s.get(i);
            }
        }System.out.println("Stack maximum"+max);
        
        int min = s.get(0);
        for (int i = 0; i < s.size(); i++) {
            for (int j = i; j < s.size(); j++) 
            if (min >= s.get(i)) {
                min = s.get(i);
            }
        }System.out.println("Stack minimum"+min);

    }

}