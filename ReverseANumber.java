package com.codinginterview;

import java.util.Scanner;

public class ReverseANumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = scanner.nextInt();
        System.out.println( "Number is :: "+ num);
        System.out.println("Reverse Number-1 is :: "+ reverseNumber1(num));
        System.out.println("Reverse Number-2 is :: "+ reverseNumber2(num));
        System.out.println("Reverse Number-3 is :: "+ reverseNumber3(num));
        // System.out.println("Reverse Number-4 is :: "+ reverseNumber4(num));
    }
    private static int reverseNumber1(int num){
        int rev = 0;
        while(num != 0){
            rev = rev*10 + num%10;
            num = num / 10;
        }
        return rev;
    }
    private static int reverseNumber2(int num){

        StringBuffer sb = new StringBuffer(num + "" );
        return Integer.parseInt(sb.reverse().toString());
    }
    private static int reverseNumber3(int num){

        StringBuilder sb = new StringBuilder(num + "");
        return Integer.parseInt(sb.reverse().toString());
    }
}
