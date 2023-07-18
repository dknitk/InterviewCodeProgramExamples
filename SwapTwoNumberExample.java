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
    private void swapUsingThridVar(int a, int b){
        System.out.println("Before Swap Values ::"+ a + " , "+ b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap Values ::"+ a + " , "+ b);
    }
    private void swapUsingMultDiv(int a , int b){
        System.out.println("Before Swap Values ::"+ a + " , "+ b);
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("After Swap Values ::"+ a + " , "+ b);
    }
    private void swapUsingBitwiseOp(int a , int b){
        System.out.println("Before Swap Values ::"+ a + " , "+ b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After Swap Values ::"+ a + " , "+ b);
    }
    private void swapUsingOtherLogic(int a , int b){
        System.out.println("Before Swap Values ::"+ a + " , "+ b);
        a = (a + b) - (a=b);
        System.out.println("After Swap Values ::"+ a + " , "+ b);
    }
}
