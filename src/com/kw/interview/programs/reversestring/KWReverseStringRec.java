package com.kw.interview.programs.reversestring;
/**
 * This class helps to write a program to reverse a string.
 * Scenario: Using Recursion
 */
public class KWReverseStringRec {

    public static void main(String[] args) {
        System.out.println("Reverse a String using Recursive Program");
        String str = "Dharmendra Kumar Sahu";
        System.out.println("Original String is ::" + str);
        System.out.println("Reversed String is ::" + reverseString(str));


    }

    public static String reverseString(String str) {
        if (str.length() == 1) {
            return str;
        }
        return str.charAt(str.length() - 1) +
                reverseString(str.substring(0, str.length() - 1));
    }
}
