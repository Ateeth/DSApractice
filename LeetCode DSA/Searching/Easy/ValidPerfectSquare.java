//Problem Link : https://leetcode.com/problems/valid-perfect-square/
package com.ateeth.LeetCodeDSA.searching.easy;

import java.util.Scanner;

public class ValidPerfectSquare {

    public static boolean isPerfectSquare(int x) {
        int beg = 1 , end = x ;
        while(beg <= end){
            int mid = beg + (end - beg) / 2 ;
            if(mid * mid == x){
                return true ;
            }else if ( mid > x / mid){
                end = mid - 1 ;
            }else{
                beg = mid + 1 ;
            }
        }
        return false ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int x = sc.nextInt() ;
        boolean ans = isPerfectSquare(x) ;
        System.out.println(ans);
    }
}
