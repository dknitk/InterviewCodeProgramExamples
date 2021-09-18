package com.kw.interview.programs.array;

public class SearchEleFromSortRotatedArray {
    /**
     * This method helps to execute the program.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(" Search an Elements from Sorted and Rotated Array");
        int arr[] = {16, 19, 21, 3, 5, 8, 10};
        System.out.println("Index of Element is :: " +
                findElementFromSortNRotatedArr(arr, 0, arr.length - 1, 5));

    }

    /**
     * This method helps to search an item from the array.
     * @param arr
     * @param low
     * @param high
     * @param item
     * @return index
     */
    private static int findElementFromSortNRotatedArr(int[] arr,
                                                      int low, int high, int item) {
        if (arr != null) {
            // Logic
            int mid;
            while (low <= high) {
                mid = low + ((high - low) / 2);
                if (arr[mid] == item) {
                    return mid;
                }
                if (arr[mid] <= arr[high]) {
                    if (item > arr[mid] && item <= arr[high]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                } else {
                    if (arr[low] <= item && item < arr[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
            }

        }
        return -1;
    }
}
