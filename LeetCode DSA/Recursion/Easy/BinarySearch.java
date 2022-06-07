//Problem Link : https://leetcode.com/problems/binary-search/
package com.ateeth.LeetCodeDSA.Recursion.Easy;

import java.util.Scanner;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        return  bs(nums , target , 0 , nums.length - 1) ;
    }

    public static int bs(int[] nums, int target , int start , int end){
        if(end < start){
            return -1 ;
        }

        int mid = start + (end - start) / 2 ;

        if(nums[mid] == target){
            return mid ;
        }

        if(nums[mid] > target){
            return bs(nums , target , start , mid - 1 ) ;
        }

        return bs(nums , target , mid + 1  , end) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter size of the array : ");
        int n = sc.nextInt() ;

        System.out.println("Enter elements of the array : ");
        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target element : ");
        int target = sc.nextInt();

        System.out.println(search(arr , target));
    }
}
