package com.codinginterview;

public class PalindromExample {
    public static void main(String[] args) {
        System.out.println("Palindrome Example");
        String inputString = "LUXXUL";
        System.out.println(inputString + " String is Palindrome or not ::"+checkPalindrom(inputString));
    }
    private static boolean checkPalindrom(String inputString){
        boolean result = true;
        int length = inputString.length();

        for(int i = 0; i< length/2; i++){
            if(inputString.charAt(i) != inputString.charAt(length - i - 1)){
                result = false;
                break;
            }
        }
        return result;
    }
}
