//Problem Link : https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
package com.ateeth.LeetCodeDSA.sorting.easy;

import java.util.Scanner;

public class MakeTwoArraysEqualByReversingSubArrays {
    public static boolean canBeEqual(int[] target, int[] arr) {
        int[] countMap = new int[1001]; //Map that holds count of ints

        //Iterate through the arrays
        for(int i = 0; i < target.length; i++) {
            countMap[target[i]]++; //Increment count of int found in target array
            countMap[arr[i]]--; //Decrement count of int found in arr array
        }

        //Iterate countMap
        for(int i : countMap) {
            //If not 0, it means target and arr do not match
            if(i != 0) {
                return false; //Return false
            }
        }

        //If this point is reached, the arrays are equal
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter the elements of the array 1 : ");
        for(int i = 0 ; i < n ; ++i ){
            arr[i] = sc.nextInt() ;
        }

        int[] arr1 = new int[n] ;
        System.out.println("Enter the elements of the array 2 : ");
        for(int i = 0 ; i < n ; ++i ){
            arr1[i] = sc.nextInt() ;
        }
        boolean ans = canBeEqual(arr , arr1) ;
        System.out.println(ans);
    }
}
