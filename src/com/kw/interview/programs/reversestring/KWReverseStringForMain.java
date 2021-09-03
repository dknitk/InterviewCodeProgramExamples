package com.kw.interview.programs.reversestring;

/**
 * This class helps to write a program to reverse a string.
 */
public class KWReverseStringForMain {

    public static void main(String[] args) {
        System.out.println("Reverse a String Program");
        String str = "AnythingCanreverse";
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr = revStr + str.charAt(i);
        }
        System.out.println("Original String is ::" + str);
        System.out.println("Reversed String is ::" + revStr);
    }
}
