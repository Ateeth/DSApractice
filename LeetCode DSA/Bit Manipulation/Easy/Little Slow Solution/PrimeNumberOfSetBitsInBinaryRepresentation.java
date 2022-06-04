//Problem Link : https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
package com.ateeth.LeetCodeDSA.bitwise.easy.LittleSlowSolution;

import java.util.* ;
public class PrimeNumberOfSetBitsInBinaryRepresentation {
    public static boolean isPrime(int n){
        if( n <= 1 ){
            return false ;
        }
        for(int i = 2 ; i <= Math.sqrt(n) ; ++i){
            if(n % i == 0){
                return false ;
            }
        }
        return true ;
    }

    public static int countSet(int x){
        int ctr = 0 ;
        while(x > 0){
            ctr += x & 1 ;
            x = x >> 1 ;
        }
        if(isPrime(ctr)){
            return 1 ;
        }

        return 0 ;
    }

    public static int countPrimeSetBits(int left, int right) {
        int i , ctr1 = 0 ;
        for(i = left ; i <= right ; ++i){
            ctr1 += countSet(i) ;
//            System.out.println(i + " " + ctr1) ;
        }

        return ctr1 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter value of left : ");
        int left = sc.nextInt() ;
        System.out.println("Enter the value of right : ");
        int right = sc.nextInt();

        System.out.println(countPrimeSetBits(left , right));
    }
}
