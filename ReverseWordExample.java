package com.codinginterview;

import java.util.Scanner;

public class ReverseWordExample {
    public static void main(String[] args) {
        System.out.println("Reverse a Word from the Sentence Example");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ::");
        String str = sc.next();
        System.out.println("String Before ::"+ str);
        System.out.println("String After ::"+ reverseWord1(str));
    }
    private static String reverseWord1(String sentance){
        sentance = "Dharmendra Kumar Sahu";
        String[] strArr = sentance.split(" ");
        String reverseString = "";
        for (String str : strArr){
            String reverseWord = "";
            for(int i = str.length() - 1; i>=0; i--){
                reverseWord = reverseWord + str.charAt(i);
            }
            reverseString = reverseString + reverseWord + " ";
        }
        return reverseString;
    }
}
