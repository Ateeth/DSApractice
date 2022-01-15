//question link : https://leetcode.com/problems/running-sum-of-1d-array/

package com.ateeth.LeetCodeDSA.arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumOf1DArray {

    static public int[] runningSum(int[] nums) {
        int sum = 0 , i ;
        for(i = 0 ; i < nums.length ; ++i){
            sum += nums[i] ;
            nums[i]  = sum ;
        }
        return nums ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter size of the array : ") ;
        int len = sc.nextInt() ;

        int[] nums = new int[len] ;
        System.out.println("Enter the elements of the array: ") ;
        for(int i = 0 ; i < len ; ++i){
            nums[i] = sc.nextInt() ;
        }

        int[] ans = runningSum(nums) ;

        System.out.println(Arrays.toString(ans)) ;
    }
}
