//Problem Link : https://www.codechef.com/problems/FIBXOR01/
package com.ateeth.LeetCodeDSA.Recursion.Easy;

import java.util.* ;
public class SpecialFibonacci {

    public static double ctr = 0 ;
    public static int fib(int a , int b , int n){
        if(n == 0){
            return a ;
        }

        if(n == 1){
            return b ;
        }


        System.out.println("ITERATION  : " + ctr);
        ++ctr ;
        return fib(a , b , n - 1) ^ fib(a , b , n - 2) ;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt() ;

        while(t > 0){
            int a = sc.nextInt() ;
            int b = sc.nextInt() ;
            int n = sc.nextInt() ;

            System.out.println(fib(a , b , n)) ;
            --t ;
        }
    }
}
