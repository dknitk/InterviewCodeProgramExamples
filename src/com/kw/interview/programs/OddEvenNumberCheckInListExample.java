package com.codinginterview;

import java.util.ArrayList;
import java.util.List;

public class OddEvenNumberCheckInListExample {
    public static void main(String[] args) {
        System.out.println("Odd Even Number Check in a List Example");

        List<Integer> numberList = List.of(2,4,6,78,34,22);
        // numberList.add(30);

        System.out.println("===== Using parallelStream function");

        System.out.println(" ODD Number available ::"
                + numberList.parallelStream().anyMatch(x -> x % 2 != 0));

        System.out.println(" Even Number available ::"
                + numberList.parallelStream().anyMatch(x -> x % 2 == 0));

        System.out.println("===== Using stream function");
        // only Stream
        System.out.println(" ODD Number available ::"
                + numberList.stream().anyMatch(x -> x % 2 != 0));

        System.out.println(" Even Number available ::"
                + numberList.stream().anyMatch(x -> x % 2 == 0));

        System.out.println("===== Old Style");
        // Old Style
        for(int i : numberList){
            if(i % 2 == 0){
                System.out.println("Event number available!");
                break;
            }else if(i % 2 != 0){
                System.out.println("Odd Number available!");
            }else{
                System.out.println("Something is wrong with the input!");
            }
        }

    }
}
