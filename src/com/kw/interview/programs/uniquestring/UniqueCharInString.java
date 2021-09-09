package com.kw.interview.programs.uniquestring;

import java.util.Objects;

/**
 * This class helps to write program for Unique Character.
 */
public class UniqueCharInString {
    /**
     * This method helps to execute the program.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("**** Unique Character in String Program *****");
        String str = "abcdef";
        System.out.println(" Is input String contain unique character ::: " + isUniqueCharInString(str));
        System.out.println(" Is input String contain unique character Using ASCI Character::: " + isUniqueStringUsingASCI(str));
    }

    public static boolean isUniqueCharInString(String str) {
        if (!Objects.isNull(str)) {
            for (int i = 0; i < str.length(); i++) {
                if (str.indexOf(str.charAt(i)) !=
                        str.lastIndexOf(str.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean isUniqueStringUsingASCI(String str) {
        boolean[] charMap = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            int asciiCode = str.toUpperCase().charAt(i) - 64;
            if (!charMap[asciiCode]) {
                charMap[asciiCode] = true;
            } else {
                return false;
            }
        }
        return true;
    }
}
