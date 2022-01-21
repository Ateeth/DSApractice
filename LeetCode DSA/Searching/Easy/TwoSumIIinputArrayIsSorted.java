//Problem Link : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
package com.ateeth.LeetCodeDSA.searching.easy;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumIIinputArrayIsSorted {

    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2] ;
        if(numbers == null || numbers.length < 2){
            return ans ;
        }

        /*Keep one index at beginning of array another at end of array*/
        int beg = 0 , end = numbers.length - 1 ;

        //beg < end to avoid reaching the same index so same element may not be used twice
        while(beg < end){
            int sum = numbers[beg] + numbers[end] ;
            if(sum == target){
                /*sum has been found update ans array with beg+1 , end+1 indices*/
                ans[0] = beg + 1 ;
                ans[1] = end + 1 ;
                return ans ;
            }else if (sum > target){
                /*sum of beg and end > target so reduce the end pointer in order to reduce the sum*/
                --end ;
            }else{
                /*sum of beg and end < target so increase the beg pointer in order to increase the sum*/
                ++beg ;
            }
        }

        return ans ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements for the array : ");
        int n = sc.nextInt() ;

        int[] numbers = new int[n] ;
        System.out.println("Enter the elements of the array in sorted order : ");
        for(int i = 0 ; i < n ; ++i){
            numbers[i] = sc.nextInt() ;
        }

        System.out.println("Enter the target sum : ");
        int target = sc.nextInt() ;

        int[] ans = twoSum(numbers , target) ;
        System.out.println(Arrays.toString(ans));
    }
}
