package com.kw.interview.programs.array;

public class MinMaxNumberFromArray {
    /**
     * This method helps to execute the program.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("**** Find Min/Max Number From Array Program *****");
        int[] array = {10, 20, 5, 15, 60, 88, 14, 36,-100};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The Min and Max numbers are :: " + min + " , " + max);
    }

}
