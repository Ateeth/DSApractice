//Problem link : https://leetcode.com/problems/jump-game/
package com.ateeth.LeetCodeDSA.arrays.medium.CouldNotThinkOfOptimalSolution;


import java.util.Scanner;

public class JumpGame {

    public static boolean canJump(int[] arr){
        //last index it is lastGoodIndex as target was the last element of array
        int lastGoodIndex = arr.length - 1 ;

        //start from last element of array
        for(int i = arr.length - 1 ; i >= 0 ; --i){
             /*
                current position + maximum jump from the position >= lastGoodIndex
                then make the last good index = to the current i
                then move backward

                in this approach we have to try and make lastGoodIndex = 0

                if we r able to make lastGoodIndex == 0 we can reach it from start point
            */
            if(i + arr[i] >= lastGoodIndex){
                lastGoodIndex = i ;
            }
        }
        return lastGoodIndex == 0 ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements to be inserted into the array : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter elements of the array : ");
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        boolean result = canJump(arr) ;
        System.out.println(result);
    }
}
