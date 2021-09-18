package com.kw.interview.programs.array;

import java.util.Arrays;

public class ArrayDefaultFill {

    /**
     * This method helps to execute the program.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("***** Default Elements Fill in the Array ****");

        int[] numbers = new  int[5];
        Arrays.fill(numbers, -1);
        System.out.println("Arrays Element is ::: "+ Arrays.toString(numbers));

        float[] floatNumbers = new float[5];
        Arrays.fill(floatNumbers, -1.0f);
        System.out.println("Arrays Element is ::: "+ Arrays.toString(floatNumbers));

        String[] stringArray = new String[10];
        Arrays.fill(stringArray, "a");
        System.out.println("String Arrays Element is ::: "+ Arrays.toString(stringArray));

        int[][] multiArray = new int[9][9];
        for(int[] multiArr : multiArray){
            Arrays.fill(multiArr, 0);
        }
        System.out.println("Multi Arrays Element is ::: "+ Arrays.deepToString(multiArray));

    }
}
