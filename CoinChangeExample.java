package com.codinginterview;

import java.util.List;

public class CoinChangeExample {
    public static void main(String[] args) {
        System.out.println("Coin Change Example!");
        List coins = List.of(1,5,10,25);
        int num = 120;
        System.out.println(changeCoinCount(coins, num));
    }
    private static int changeCoinCount(List<Integer> coins, int num){
        int min = num;
        int count = 0;
        if(min <= 0) return count;
        while(min > 0){
            if(coins.contains(min)){
                return ++count;
            }
            for (int i = coins.size() -1; i>= 0; i--){
                int temp = min - coins.get(i);
                if(temp >= 0){
                    min = temp;
                    count++;
                }
                if(temp >= coins.get(i)){
                    min = temp;
                    i++;
                }

            }
        }
        return count;
    }
}
