package com.codinginterview;

public class ReverseStringExample {

    public static void main(String[] args) {
        System.out.println("**** Reverse a String Example *****");
        String str = "Dharmendra";
        System.out.println("Original String ::"+ str);
        System.out.println("Reverse String - 1 ::"+reverseString1(str));
        System.out.println("Reverse String - 2 ::"+reverseString2(str));
        System.out.println("Reverse String - 3 ::"+reverseString3(str));
    }

    private static String reverseString1(String str){

        if(str != null || str.isBlank() || str.isEmpty()){
            StringBuffer sb = new StringBuffer(str);
            return sb.reverse().toString();
        }
        return null;
    }
    private static String reverseString2(String str){

        String rev = "";
        int len = str.length();
        for(int i = len -1; i>= 0; i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }

    private static String reverseString3(String str){

        String rev = "";
        char a[] = str.toCharArray();
        int len = a.length;
        for(int i = len -1; i>= 0; i--){
            rev = rev + a[i];
        }
        return rev;
    }
}
