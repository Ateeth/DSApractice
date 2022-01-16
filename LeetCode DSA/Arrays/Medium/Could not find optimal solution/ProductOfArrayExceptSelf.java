//Problem Link : https://leetcode.com/problems/product-of-array-except-self/
package com.ateeth.LeetCodeDSA.arrays.medium.CouldNotThinkOfOptimalSolution;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArrayExceptSelf
{
    /*
       one way to solve this problem is maintain a left products array and maintain a right products array
       example nums = [1 2 3 4]
       left products array = [1 1 2 6]
       right products array = [24 12 4 1]
       multiply corresponding indices of left and right products array
       result= [1*24 1*12 2*4 6*1] = [24 12 8 6]
   */
    public static int[] productExceptSelf(int[] nums) {

        //intialize the results array
        int[] res = new int[nums.length] ;

        //let 1st element of result array be 1 intitally as when taking left products it does not have any left neighbour
        res[0] = 1 ;

        //let last element of result array be 1 initally as when taking right products the last element has no right neighbour
        res[nums.length - 1] = 1 ;

        //start from index 1 and update the res array with products of left elements before it
        //like cummulative multiplication it will be
        for(int i = 1 ; i < nums.length ; ++i){

            //take the previous cumulative multiplication and multiply with the nums index of previous position
            //this will ensure u have the product of all elements to the left of the current i index
            /*
                example
                nums = [1 2 3 4]
                res = [1 0 0 1]

                i = 1
                    res[1] = res[0] * nums[0] = 1
                    updated res = [1 1 0 1]

                i = 2
                    res[2] = nums[1] * res[1] = 2
                    updated res = [1 1 2 1]

                i = 3
                    res[3] = nums[2] * res[2] = 6
                    updated res = [1 1 2 6]
            */
            res[i] = res[i-1] * nums[i - 1] ;
        }

        //now start from last - 1 index and move left

        //the variable right will store product of nums elements to the right of the index
        //at first right is 1 as for last element of res array we do not have a right neighbour
        int right = 1 ;
        for( int i = nums.length - 1 ; i >= 0 ; --i){
            /*
                res = [1 1 2 6]
                nums = [1 2 3 4]
                right = 1

                i = 3
                    res[3] = res[3] * right = 6 * 1 = 6
                    note that last index wont get updated

                    right *= nums[i] => 1 * 4 = 4

                    updated res = [1 1 2 6]

                i = 2
                    res[2] = res[2] * right = 2 * 4 = 8
                    right *= nums[2] => 4 * 3 = 12

                    updated res = [1 1 8 6]

                i = 1
                    res[1] = res[1] * right = 1 * 12 = 12
                    right *= nums[1] => 12 * 2 = 24

                    updated res = [1 12 8 6]

                i = 0
                    res[0] = res[0] * right = 1 * 24 = 24
                    right *= nums[0] => 24 * 1 = 24 (no point as last iteration of loop)

                    updated res = [24 12 8 6]
            */
            res[i] = res[i] * right ;
            right *= nums[i] ;
        }

        return res ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt() ;

        System.out.println("Enter the elements of the array : ");
        int[] nums = new int[n] ;
        for(int i = 0 ; i < n ; ++i ){
            nums[i] = sc.nextInt()  ;
        }

        int[] ans = productExceptSelf(nums) ;
        System.out.println(Arrays.toString(ans));
    }
}
