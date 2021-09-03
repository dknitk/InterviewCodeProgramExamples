package com.kw.interview.programs.reversestring;
/**
 * This class helps to write a program to reverse a string.
 * Scenario: Using StringBuffer
 */
public class KWReverseStringWithStringBuffer {
    public static void main(String[] args){
        System.out.println("Reverse a String using StringBuffer Program");
        String str = "Dharuv Sahu";
        StringBuffer sf = new StringBuffer(str);
        System.out.println("Original String is ::" + str);
        System.out.println("Reversed String is ::" + sf.reverse());

    }
}
