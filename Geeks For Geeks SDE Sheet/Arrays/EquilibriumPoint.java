//Problem Link : https://www.geeksforgeeks.org/find-element-array-sum-left-array-equal-sum-right-array/
package com.ateeth.GeeksForGeeksDSA.SDESheet.Arrays;

import java.util.Scanner;

/*
 at each point check sum of elements to right of index : totalSum - summTillIndex - element at index
 compare it with sum of elements to left of index : runningSum
 if both r equal return the index else return -
 */
public class EquilibriumPoint {

    public static int equi(int[] nums , int n){
        long sum = 0 , runningSum = 0 ;

        for(int i = 0 ; i < nums.length ; ++i){
            sum += nums[i] ;
        }

        for(int i = 0 ; i < nums.length ; ++i){
            if(sum - runningSum - nums[i] == runningSum){
                return i + 1 ;
            }
            runningSum += nums[i] ;
        }

        return -1 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter size of array : ");
        int n = sc.nextInt(); ;

        int[] arr = new int[n] ;
        System.out.println("Enter array elements : ");
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
        }
        System.out.println(equi(arr, n));
    }
}
