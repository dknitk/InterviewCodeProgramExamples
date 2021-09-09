package com.kw.interview.programs.rotationstring;

import java.util.Objects;

/**
 * This class helps to write logic to compare
 * a string with rotation.
 */
public class RotationStringExample {

    /**
     * This method helps to execute the program.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("**** Rotation String Example Program *****");
        String str = "javablogs";
        String rotation = "sgolbavaj";
        System.out.println("Is Rotation String ::" + isRotationString(str, rotation));
    }

    /**
     * This method helps to compare original string with the rotation.
     *
     * @param str
     * @param rotation
     * @return boolean
     */
    public static boolean isRotationString(String str, String rotation) {

        if (!Objects.isNull(str) && !Objects.isNull(rotation)) {
            String strTemp = reverseString(str);
            if (strTemp.equals(rotation)) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method helps to reverse a String.
     *
     * @param str
     * @return String
     */
    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
