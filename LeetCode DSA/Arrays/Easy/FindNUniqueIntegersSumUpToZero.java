//Problem link : https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
package com.ateeth.LeetCodeDSA.arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

public class FindNUniqueIntegersSumUpToZero {

    public static int[] sumZero(int n) {
        int[] arr = new int[n] ;

       /* in odd pos insert 1 2 3 4 ..
        in even pos insert -1 -2 -3 -4 ...
        if odd number of elements there will be an extra positive number resulting in total sum not equal to 0
        so if odd number of elements make last element of array = 0
        */
        int ctr1 = -1  , ctr2 = 1;
        for(int i = 0 ; i < n ; ++i){
            if(i%2 ==0){
                arr[i] = ctr1 ;
                --ctr1;
            }else{
                arr[i] = ctr2 ;
                ++ctr2 ;
            }
        }

        if(n%2 == 1){
            arr[n-1] = 0 ;
        }

        return arr  ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n ;
        System.out.println("Enter the value of n : ");
        n = sc.nextInt() ;

        int[] ans  = sumZero(n) ;
        System.out.println(Arrays.toString(ans));
    }
}
