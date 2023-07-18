package com.codinginterview;

public class BinarySearchExample {

    public static void main(String[] args) {
        System.out.println("Binary Search Example!");
        int[] arr = {1,2,4,6,7,12,13,14};
        int key = 12;
        int low = 0;
        int high = arr.length;
        System.out.println("Index of Key is :: "+
                binarySearch(arr, low, high, key));
    }

    private static int binarySearch(int arr[], int low, int high, int key){

        int mid = (low + high)/2;
        while(low <= high){
            if(arr[low] < key) {
                low = mid + 1;
            }else if (arr[mid] == key){
                return mid;
            }else{
                high = mid - 1;
            }
            mid = (low + high)/2;
        }
        if(low > high){
            return -1;
        }
        return -1;
    }
}
