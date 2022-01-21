//Problem Link : https://leetcode.com/problems/sqrtx/
package com.ateeth.LeetCodeDSA.searching.easy;

import java.util.Scanner;

public class SqrtOfX {

    public static int mySqrt(int x) {
        int start = 1 , end = x ;
        while(start <= end){
            int mid = start + (end - start) / 2 ;
            if(mid == x / mid){
                return (int)mid ;
            }
            else if (mid > x / mid){
                end = mid - 1 ;
            }else{
                start = mid+ 1  ;
            }
        }
        return end ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the nimber to find the integer part of square root of : ");
        int x = sc.nextInt() ;
        int ans = mySqrt(x) ;

        System.out.println(ans);
    }
}
