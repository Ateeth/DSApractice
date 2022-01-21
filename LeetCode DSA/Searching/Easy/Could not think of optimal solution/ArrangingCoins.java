//Problem Link : https://leetcode.com/problems/arranging-coins/
package com.ateeth.LeetCodeDSA.searching.easy.CouldNotThinkOfOptimalSolution;

import java.util.Scanner;

public class ArrangingCoins {

    public static int arrangeCoins(int n){
        long beg = 0 , end = n ;

        //find that number between 0 and n
        while(beg <= end){

            //mid value in the range
            long mid = beg + (end - beg) ;

            //sum till that k number can be given k*(k+1)/2
            long currSum = mid * (mid + 1) / 2 ;

            //return the mid value if sum == n
            if(currSum == n){
                return (int)mid ;
            }

            //Sum till mid value of range is greater than n so move end pointer to mid - 1
            else if(currSum > n){
                end = mid - 1 ;
            }

            //Sum till mid value of range is smaller than n so move beg pointer to mid +  1
            else{
                beg = mid + 1 ;
            }
        }

        //return mid-1 value as no such sum till elements == n if return mid-1 it is element till which sum < n
        return (int)end;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of coins : ");
        int n = sc.nextInt() ;
        int ans = arrangeCoins(n)  ;
        System.out.println(ans);
    }
}
