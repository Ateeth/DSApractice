//Problem Link : https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1
package com.ateeth.LeetCodeDSA.math.easy;

import java.util.* ;
public class ArmstrongNumbers {
    public static String armstrongNumber(int n){
        int sum = 0 ;
        int x = n ;
        while(n > 0){
            sum += Math.pow(n % 10 , 3) ;
            n /= 10 ;
        }

        if(sum == x || x == 0){
            return "Yes" ;
        }

        return "No" ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt() ;
        System.out.println(armstrongNumber(n));
    }
}
