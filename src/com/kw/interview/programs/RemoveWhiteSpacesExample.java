package com.codinginterview;

import java.util.Arrays;

public class RemoveWhiteSpacesExample {
    public static void main(String[] args) {
        System.out.println("Remove White Spaces from the String Example!");
        String inputString = " Hello Ram ";
        StringBuilder sb = new StringBuilder();
        char[] charArray = inputString.toCharArray();
        for(char c : charArray){
            if(!Character.isWhitespace(c)){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());

        // Leading and Trailing spaces
        String str = " abc def\t";
        str = str.strip();
        System.out.println(str);

        // Sort an Array
        int[] numbers = {2,1,44,20,4,66,4};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
