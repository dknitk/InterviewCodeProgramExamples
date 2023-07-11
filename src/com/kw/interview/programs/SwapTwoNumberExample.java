package com.codinginterview;

public class SwapTwoNumberExample {
    public static void main(String[] args) {
        System.out.println("Swap Two Number Example");
        int a = 10;
        int b = 30;
        System.out.println("The Number a is before swap:: "+ a);
        System.out.println("The Number b is is before swap:: "+ b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("The Number a is after swap:: "+ a);
        System.out.println("The Number b is after swap:: "+ b);
    }
}
