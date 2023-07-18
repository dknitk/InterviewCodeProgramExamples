package com.codinginterview;

import java.util.Arrays;

public class ArrayEqualExample {
    public static void main(String[] args) {
        System.out.println("Array Equal Example");
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5};
        int[] c = {2,3};
        System.out.println("Are arrays equal-1 ::"+arrayEqual1(a, b));
        System.out.println("Are arrays equal-2 ::"+arrayEqual2(c, b));
    }
    private static boolean arrayEqual1(int [] a, int [] b){
        return Arrays.equals(a, b);
    }
    private static boolean arrayEqual2(int [] a, int [] b){
        if(a.length != b.length)
            return false;
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i])
                return false;
        }
        return true;
    }
}
