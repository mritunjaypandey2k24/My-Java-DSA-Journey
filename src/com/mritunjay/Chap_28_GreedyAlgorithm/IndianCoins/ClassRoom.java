package com.mritunjay.Chap_28_GreedyAlgorithm.IndianCoins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ClassRoom {
    public static void main(String [] args){
        Integer [] coins = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder());

        ArrayList<Integer> ans = new ArrayList<>();
        int countOfCoins = 0;
        int amount = 1089;

        for(int i=0; i<coins.length; i++){
            if(coins[i] <= amount){
                while(coins[i]<= amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println("Total coins (min) for amount  = "+countOfCoins);

        for(int coin : ans){
            System.out.print(coin + " ");
        }
        System.out.println();
    }
}
