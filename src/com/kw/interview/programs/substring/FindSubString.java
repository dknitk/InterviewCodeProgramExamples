package com.kw.interview.programs.substring;

import java.util.HashSet;
import java.util.Set;

public class FindSubString {

    /**
     * This method helps to execute the program.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("**** Find Sub String Program *****");
        String str = "dharmendra";
        Set set = new HashSet();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String strTemp = str.substring(i, j);
                if (!set.contains(strTemp)) {
                    set.add(strTemp);
                    System.out.println(str.substring(i, j));
                }
            }
        }
    }
}
