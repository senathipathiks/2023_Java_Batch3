package com.javacoreday3;

public class StringReverseSplit {
    public static void main(String[] args) {
        String input = "java is a programming language";
        String output = reverseWords(input);
        System.out.println(output);
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }

        return reversedString.toString().trim();
    }
}

