package com.kw.interview.programs.array;

public class MinimumElemFromSortNRotatedArray {

    /**
     * This method helps to execute the program.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(" Search an Elements from Sorted and Rotated Array");
        int arr[] = {16, 19, 21, 2, 3, 5, 8, 10};
        System.out.println("Index of Element is :: " +
                MinElementFromSortNRotatedArr(arr, 0, arr.length - 1));

    }

    /**
     * This method helps to find minimum number from the array.
     *
     * @param arr
     * @param low
     * @param high
     * @return int
     */
    private static int MinElementFromSortNRotatedArr(int[] arr, int low, int high) {
        int mid;
        while (low < high) {
            mid = low + ((high - low) / 2);
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return arr[low];
    }
}
