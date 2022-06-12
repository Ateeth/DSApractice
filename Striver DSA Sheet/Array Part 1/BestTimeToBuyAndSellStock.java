//Problem Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
package com.ateeth.StriverSheet.Arrays1;

import java.util.* ;
public class BestTimeToBuyAndSellStock {
    /*
   Start iterating from first and store minimum price so far in a variable and
   keep finding profit of current day price - minimum price so far

   store max profit in a variable and return
   */
    public static int maximumProfit(ArrayList<Integer> prices){
        int minSoFar = prices.get(0) ;
        int profit = 0 , maxProfit = 0 ;
        for(int i = 1; i < prices.size() ; ++i){
            profit = prices.get(i) - minSoFar ;
            maxProfit = Math.max(profit , maxProfit) ;
            minSoFar = Math.min(minSoFar , prices.get(i)) ;
        }


        return maxProfit ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter number of days : ");
        int n = sc.nextInt() ;

        ArrayList<Integer> arr = new ArrayList<>() ;
        for(int i = 0 ; i < n ; ++i){
            int x = sc.nextInt();
            arr.add(x) ;
        }

        System.out.println(maximumProfit(arr));
    }
}

