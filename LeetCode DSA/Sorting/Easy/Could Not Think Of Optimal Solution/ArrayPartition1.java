//Problem Link : https://leetcode.com/problems/array-partition-i/
package com.ateeth.LeetCodeDSA.sorting.easy.CouldNotThinkOfOptimalSolution;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPartition1 {

    public static int arrayPairSum(int[] nums) {
        /*
        In this qn the optimal pairing is every pair of adjacent elements after the array is sorted
        So first sort the array
        And the minimum of each of the pairs after array is sorted obviously will be the even indices of the array
        i.e) pair of indices of 6 elements => (0,1) (2,3) (4,5)
        the minimum element of each pair will like at 0 2 4 i.e even indices
        we will just run a loop and sum the even indices of nums after sorting it
        */

        Arrays.sort(nums) ;
        int sum = 0 ;
        for(int i = 0 ; i < nums.length ; i += 2){
            sum += nums[i] ;
        }

        return sum  ;
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

        int ans = arrayPairSum(arr) ;
        System.out.println(ans);
    }
}
