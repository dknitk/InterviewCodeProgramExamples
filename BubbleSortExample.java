package com.codinginterview.Sort;

import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        System.out.println("**** Bubble Sort Example ****");
        int[] a = {1,32,4,21,10,2};
        bubbleSort(a);
    }
    private static void bubbleSort(int[] a){
        System.out.println("Array Before Sort ::"+ Arrays.toString(a));
        //Arrays.sort(a);
        //System.out.println("Array after sort - Inbuild method :: "+Arrays.toString(a));
        for(int i = 0; i <= a.length -1; i ++){
            System.out.println("**** Pass "+(i+1) +"****");
            for(int j = 0; j < a.length - i - 1; j++){
                if(a[j] > a[j + 1]){
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
                System.out.println(Arrays.toString(a));
            }
        }
        System.out.println("Array after sort - Bubble Sort Algo :: "+Arrays.toString(a));
    }
}
