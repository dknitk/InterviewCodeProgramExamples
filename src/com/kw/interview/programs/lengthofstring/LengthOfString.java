package com.kw.interview.programs.lengthofstring;

public class LengthOfString {
    /**
     * This method helps to execute the program.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("**** Find Sub String Program *****");
        String str = "dharmendra";
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            length++;
        }

        System.out.println("Length of the String is ::: " + length);
    }
}
