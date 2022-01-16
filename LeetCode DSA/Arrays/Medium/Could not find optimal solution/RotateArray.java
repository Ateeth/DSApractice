//Problem Link : https://leetcode.com/problems/rotate-array/
        /*
            trial run
            example 1 : [1 2 3 4 5 6 7] , len = 7,  k = 3
                i) reverse from index 0 to 7 - 1 - 3 i.e index 0 to index 3
                    updated : [4 3 2 1 5 6 7]

                ii) reverse from index len - k to index len -1 => index 4 to index 6
                    updated : [4 3 2 1 7 6 5]

                iii) reverse entire array
                    updated : [5 6 7 1 2 3 4]
        */

package com.ateeth.LeetCodeDSA.arrays.medium.CouldNotThinkOfOptimalSolution;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

    public static void reverse(int[] arr , int start , int end){
        int len = end - start ;
        for(int i = start ; i <= len/2 ; ++i){
            int temp = arr[i] ;
            arr[i] = arr[end - i] ;
            arr[end-i] = temp  ;
        }
    }

    public static int[] rotateArray(int[] arr , int k){
        k = k % arr.length ;
        reverse(arr , 0 , arr.length - k - 1 );
        reverse(arr , arr.length - k , arr.length - 1) ;
        reverse(arr , 0 , arr.length - 1) ;
        return arr ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt() ;

        System.out.println("Enter the number of elements in the array : ");
        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();

        int[] ans = rotateArray(arr , k) ;
        System.out.println(Arrays.toString(ans));
    }
}
