//Problem Link : https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
package com.ateeth.LeetCodeDSA.sorting.easy;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumProductOf2ElementsInAnArray {
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums) ;
        return Math.max(((nums[0] - 1) * (nums[1] - 1)) , ((nums[nums.length - 1] -1) * (nums[nums.length - 2] - 1)));
    }

    public static void main(String[] args){
        int n ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements in the array : ");
        n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        int ans = maxProduct(arr) ;
        System.out.println(ans);
    }
}
