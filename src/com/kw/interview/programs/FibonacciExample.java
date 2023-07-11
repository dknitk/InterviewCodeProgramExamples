package com.codinginterview;

public class FibonacciExample {
    public static void main(String[] args) {
        System.out.println("Fibonacci Sequence Example");
        printFibonacciSeq(10);
        System.out.println();
        for (int i = 0; i < 10; i++){
            System.out.print(fibRec(i) + ", ");
        }
    }

    private static void printFibonacciSeq(int count){
        int a = 0;
        int b = 1;
        int c = 1;

        for(int i = 1; i<= count; i++){
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a + b;
        }
    }

    private static int fibRec(int count){
        if(count <= 1){
            return count;
        }
        return fibRec(count -1) + fibRec(count - 2);
    }
}
