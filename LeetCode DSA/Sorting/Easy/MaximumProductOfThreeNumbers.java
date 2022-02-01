//Problem Link : https://leetcode.com/problems/maximum-product-of-three-numbers/
package com.ateeth.LeetCodeDSA.sorting.easy;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumProductOfThreeNumbers {

    public static  int maximumProduct(int[] nums) {
        Arrays.sort(nums) ;

        //One possible case of last 3 elements of sorted array giving the max sum
        int prod1 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3] ;

        //possible scenario of negative numbers so multiply the first 2 elements if by chance negative and the last element it may end up giving a larger product
        int prod2 = nums[nums.length - 1] * nums[0] * nums[1] ;

        //return which of the 2 products is larger
        return Math.max(prod1 , prod2) ;
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

        int ans = maximumProduct(arr) ;
        System.out.println(ans);
    }
}
