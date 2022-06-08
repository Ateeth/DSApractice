//Problem Link : https://www.geeksforgeeks.org/sum-digit-number-using-recursion/
package com.ateeth.LeetCodeDSA.Recursion.Easy;

import java.util.* ;
public class SumOfDigitsOfANumber {
    public static int sum(int x){
        if(x <= 0 ){
            return 0 ;
        }

        return x%10 + sum(x/10) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter value of n : ");
        int n = sc.nextInt() ;
        System.out.println(sum(n));
    }
}
