//Problem Link : https://practice.geeksforgeeks.org/problems/geek-onacci-number/0/#
package com.ateeth.LeetCodeDSA.Recursion.Easy;

import java.util.* ;
public class GeekonacciNumber {

    public static int geek(int a , int b , int c , int n){
        if(n == 1){
            return a ;
        }

        if(n == 2){
            return b ;
        }

        if(n == 3){
            return c ;
        }

        return geek(a,b,c,n - 1) + geek(a,b,c,n-2) + geek(a,b,c,n-3) ;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt() ;

        while(t > 0){
            int n , a , b , c ;
            a = sc.nextInt() ;
            b = sc.nextInt() ;
            c = sc.nextInt() ;
            n = sc.nextInt() ;

            System.out.println(geek(a , b , c , n)) ;
            --t ;
        }
    }
}
