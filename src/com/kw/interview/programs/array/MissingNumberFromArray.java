package com.kw.interview.programs.array;

import java.util.stream.IntStream;

public class MissingNumberFromArray {
    /**
     * This method helps to execute the program.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("**** Find Min/Max Number From Array Program *****");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        int sumOfArrEle = 0;
        /*for (int num : array) {
            sumOfArrEle += num;
        }*/
        sumOfArrEle = IntStream.of(array).sum();
        // sumOfArrEle = Arrays.stream(array).sum();
        // sumOfArrEle = Arrays.stream(array).summaryStatistics().getSum();
        System.out.println("The Missing Number is ::: " +
                (sumOfNaturalNumber(array.length + 1) - sumOfArrEle));

    }

    /**
     * This method helps to get the sum of natural numbers.
     * @param totalNumber
     * @return int
     */
    private static int sumOfNaturalNumber(int totalNumber) {

        return totalNumber * (totalNumber + 1) / 2;
    }

}
