//Problem Link : https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
package com.ateeth.LeetCodeDSA.sorting.easy;

import java.util.Arrays;
import java.util.Scanner;

public class CanMakeArithmeticProgressionFromSequence {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr) ;
        if(arr.length < 3){
            return true  ;
        }
        int diff = arr[1] - arr[0] ;
        for(int i = 1 ; i < arr.length ; ++i){
            if(arr[i] - arr[i-1] != diff){
                return false ;
            }
        }

        return true ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt()  ;

        int[] nums = new int[n] ;
        System.out.println("Enter the elements of nums : ");
        for(int i = 0 ; i < n ; ++i){
            nums[i] = sc.nextInt() ;
        }

        boolean ans = canMakeArithmeticProgression(nums) ;
        System.out.println(ans);
    }
}
