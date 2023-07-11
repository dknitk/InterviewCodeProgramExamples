package com.codinginterview;

public class PrimeNumberExample {
    public static void main(String[] args) {
        System.out.println("Prime Number Example");
        //
        int num = 13;
        System.out.println("The given Number "+ num +" is prime or not ::"
                + isPrime(num));
    }
    public static boolean isPrime(int num){

        if(num == 0 || num == 1){
            return false;
        }
        if(num == 2)
            return true;

        for(int i = 2; i <= num/2; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
}
