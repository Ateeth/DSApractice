//Problem Link : https://leetcode.com/problems/contains-duplicate/
package com.ateeth.LeetCodeDSA.sorting.easy;

import java.util.Arrays;
import java.util.Scanner;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums) ;
        int i ;
        for(i = 0 ; i < nums.length - 1 ; ++i){
            if(nums[i] == nums[i + 1]){
                return true ;
            }
        }
        return false ;
    }

    public static void main(String[] args){
        int n ,target  ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements in the array : ");
        n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        boolean ans = containsDuplicate(arr) ;
        System.out.println(ans);
    }
}
