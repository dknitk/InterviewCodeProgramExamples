package com.codinginterview;

public class FactorialExample {
    public static void main(String[] args) {
        System.out.println("Factorial of a Number");
        System.out.println("Factorial of given number is ::"+ factorialNumber(10));

    }
    private static long factorialNumber(long n){
        if(n == 1)
            return 1;
        else
            return (n* factorialNumber(n-1));
    }
}