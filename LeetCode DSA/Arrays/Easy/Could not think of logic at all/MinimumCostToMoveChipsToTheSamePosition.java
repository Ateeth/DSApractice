//Problem Link : https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
package com.ateeth.LeetCodeDSA.arrays.easy.CouldNotThinkOfLogicAtAll;

import java.util.Scanner;

/*
Algorithm : In this problem it is given the cost of
i) moving a chip 2 steps left or right is 0
ii) moving a chip 1 step left or right is 1

now in an array distance between 2 even positions is 2 and the distance between 2 odd positions is 2 as well
so first we can bring all chips at even positions together at no cost
also all chips at odd positions can be bought just 1 step beside where the even chips have been gathered

if there are more chips in even position return the number of chips in odd position as cost as the cost of moving all odd chips
1 step to left or right will be minimum

if there are more chips in odd position return the number of chips in even position as cost as the cost of moving all even chips
1 step to left or right will be minimum

 */
public class MinimumCostToMoveChipsToTheSamePosition {

    public static int minCostToMoveChips(int[] position) {
        int odd = 0 , even = 0  ;

        //count the number of even and odd positions
        for(int i : position){
            if( i % 2 == 0){
                ++even ;
            }else{
                ++odd ;
            }
        }

        return Math.min(even, odd) ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of chips : ");
        int n = sc.nextInt() ;

        int[] position = new int[n] ;
        System.out.println("Enter the position of the various chips : ");
        for(int i = 0 ; i < n ; ++i){
            position[i] = sc.nextInt() ;
        }

        int ans = minCostToMoveChips(position) ;
        System.out.println(ans);
    }
}
