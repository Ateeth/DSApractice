//Problem Link : https://leetcode.com/problems/find-the-highest-altitude/
package com.ateeth.LeetCodeDSA.arrays.easy;

import java.util.* ;
public class FindTheHighestAltitude {

    public static int findAltitude(int[] gain){
        //Aproach 1
        int max = 0 ;
        int alt = 0 ;
        for(int i = 0 ; i < gain.length ; ++i){
            alt += gain[i] ;
            max = Math.max(max , alt) ;
        }

        /*  Approach 2
        int[] res = new int[gain.length + 1] ;
        res[0] = 0 ;
        int max = 0 ;
        for( int i = 1 ; i <= gain.length ; ++i ){
            res[i] = res[i-1] + gain[i-1] ;
            max = Math.max(max , res[i]) ;
        }
       */

        return max ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        int n ;
        System.out.println("Enter the number of points: ") ;
        n = sc.nextInt();

        int[] gain = new int[n] ;
        System.out.println("Enter the gain in altitude between the points: ") ;
        for(int i = 0 ; i < n ; ++i){
            gain[i] = sc.nextInt() ;
        }

        int ans = findAltitude(gain) ;
        System.out.println((ans));
    }
}
