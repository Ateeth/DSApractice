//Problem Link : https://leetcode.com/problems/target-sum/
package com.ateeth.LeetCodeDSA.Recursion.medium;

import java.util.Scanner;

public class TargetSum {
    public static int targetSum(int[] nums , int idx , int sumFound , int S){
        if(idx == nums.length){
            if(sumFound == S){
                return 1 ;
            }

            return 0 ;
        }

        int ctr = 0 ;

        //try add nums[idx] to sumFound
        ctr += targetSum(nums , idx + 1 , sumFound + nums[idx] , S) ;

        //try subtract nums[idx] to sumFound
        ctr += targetSum(nums , idx + 1 , sumFound - nums[idx] , S) ;

        return ctr ;
    }

    public static int findTargetSumWays(int[] nums, int S) {
        return targetSum(nums,0,0,S);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();

        System.out.println("Enter elements of the array : ");
        int[] arr = new int[n] ;

        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target sum : ");
        int target = sc.nextInt();

        System.out.println(findTargetSumWays(arr , target));
    }
}
