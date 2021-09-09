package com.kw.interview.programs.anagrams;

import java.util.Arrays;
import java.util.Objects;

/**
 * This class helps to write program to validate Anagrams.
 */
class AnagramsExmWithIndex {

    /**
     * This method helps to start the execution of the program.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Anagrams Program");
        String str1 = null;
        String str2 = null;
        System.out.println("Is Strings are Anagrams using Index ::: " +
                checkAnagramsWithIndex(str1, str2));

        System.out.println("Is Strings are Anagrams using Sort ::: " +
                checkAnagramsWithSort(str1, str2));

        System.out.println("Is Strings are Anagrams using Array ::: " +
                checkAnagramsWithArray(str1, str2));
    }

    /**
     * This method helps write code to check Anagrams String.
     * Scenario: Check based on Index.
     *
     * @param str1
     * @param str2
     * @return boolean
     */
    public static boolean checkAnagramsWithIndex(String str1,
                                                 String str2) {
        if(!Objects.isNull(str1) && !Objects.isNull(str2)){
            if (str1.length() != str2.length()) {
                return false;
            } else {
                for (int i = 0; i < str1.length(); i++) {
                    int index = str2.indexOf(str1.charAt(i));
                    if (index == -1) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /**
     * This method helps write code to check Anagrams String.
     * Scenario: Check based on Sort.
     *
     * @param str1
     * @param str2
     * @return boolean
     */
    public static boolean checkAnagramsWithSort(String str1,
                                                String str2) {

        if(!Objects.isNull(str1) && !Objects.isNull(str2)){
            if (str1.length() != str2.length()) {
                return false;
            }else if (sortString(str1).equals(sortString(str2))) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method helps to sort the string.
     *
     * @param str
     * @return String
     */
    private static String sortString(String str) {
        char[] wordArr = str.toCharArray();
        Arrays.sort(wordArr);
        return String.valueOf(wordArr);
    }

    /**
     * This method helps write code to check Anagrams String.
     * Scenario: Check based on Array.
     *
     * @param str1
     * @param str2
     * @return boolean
     */
    public static boolean checkAnagramsWithArray(String str1,
                                                 String str2) {
        if(!Objects.isNull(str1) && !Objects.isNull(str2)){
            if (str1.length() != str2.length()) {
                return false;
            }
            int count[] = new int[256];
            for (int i = 0; i < str1.length(); i++) {
                count[str1.charAt(i)]++;
                count[str2.charAt(i)]--;
            }
            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    return false;
                }
            }
        }
        return false;
    }
}
