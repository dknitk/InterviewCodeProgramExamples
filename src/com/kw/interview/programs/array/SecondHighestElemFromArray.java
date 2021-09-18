package com.kw.interview.programs.array;

import java.util.Arrays;

public class SecondHighestElemFromArray {
    /**
     * This method helps to execute the program.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(" Second Highest Elements from Array");
        int arr[] = {16, 19, 21, 2, 100, 3, 5, 8, 10, 200};
        System.out.println("The second highest number is ::: " + findSecondHighestNumber(arr));
    }

    private static int findSecondHighestNumber(int arr[]) {
        int[] numbers = new int[arr.length];
        Arrays.fill(numbers, Integer.MIN_VALUE);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > numbers[0]) {
                numbers[1] = numbers[0];
                numbers[0] = arr[i];
            }else if(arr[i] > numbers[1]){
                numbers[1] = arr[i];
            }
        }
        return numbers[1];
    }
}
