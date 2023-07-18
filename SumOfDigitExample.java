package com.codinginterview;

import java.util.Scanner;

public class SumOfDigitExample {
    public static void main(String[] args) {
        System.out.println("Sum of Digit Example");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ::");
        int num = sc.nextInt();
        System.out.println("Given Digit is ::"+num);
        System.out.println("Sum of Digit is ::"+sumOfDigit(num));
    }
    private static int sumOfDigit(int num){
        int sum = 0;
        while(num != 0){
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;
    }
}
