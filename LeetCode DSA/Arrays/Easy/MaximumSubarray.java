//Problem Link : https://leetcode.com/problems/maximum-subarray/
package com.ateeth.LeetCodeDSA.arrays.easy;

/*We use Kadane's Algorithm*/

import java.util.Scanner;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int sum = nums[0] , max = nums[0] ;
        for(int i = 1 ; i < nums.length ; ++i){
            //if sum less than 0 reset it to 0
            if(sum < 0){
                sum = 0 ;
            }

            //add the elements to sum
            sum += nums[i] ;

            //max of sum at any point of time
            max = Math.max(sum , max) ;
        }
        return max ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt() ;

        int[] nums = new int[n] ;
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; ++i){
            nums[i] = sc.nextInt() ;
        }

        int ans = maxSubArray(nums) ;
        System.out.println(ans);
    }
}
