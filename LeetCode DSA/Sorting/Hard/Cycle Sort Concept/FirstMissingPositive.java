//Problem Link : https://leetcode.com/problems/first-missing-positive/
package com.ateeth.LeetCodeDSA.sorting.hard.CycleSortConcept;

import java.util.Scanner;

public class FirstMissingPositive {
    public static void swap(int[] nums, int first , int second){
        int temp = nums[first] ;
        nums[first] = nums[second] ;
        nums[second] = temp ;
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0 ;

        /*
        Cyclic sort ignore negative numbers and numbers greater than nums.length
        */
        while( i < nums.length ){
            int correct = nums[i] - 1 ;

            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums , i , correct) ;
            }else{
                ++i ;
            }
        }

        /*
        find first missing number and return i+1 if nums[i] != i+1
        as i+1 will be the missing number
        */
        for( i = 0 ; i < nums.length ; ++i ){
            if(nums[i] != i + 1){
                return i + 1 ;
            }
        }

        /*
        case when positive all numbers till nums.length exist
        so return nums.length + 1
        */
        return nums.length + 1 ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; ++i ){
            arr[i] = sc.nextInt() ;
        }

        int ans = firstMissingPositive(arr) ;
        System.out.println(ans);
    }
}
