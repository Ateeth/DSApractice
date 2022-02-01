//Problem Link : https://leetcode.com/problems/majority-element/
package com.ateeth.LeetCodeDSA.sorting.easy;

import java.util.Scanner;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        //Arrays.sort(nums);

        /*
        If majority element occur atleast n/2 times
        so after sorting return nums[nums.length / 2]
         */

        //bubble sort
        for(int i = 0 ; i < nums.length ; ++i){
            boolean swapped = false ;
            for(int j = 0 ; j < nums.length - i - 1 ; ++j){
                if(nums[j] > nums[j + 1]){
                    int temp = nums[j] ;
                    nums[j] = nums[j+1] ;
                    nums[j+1] = temp ;
                    swapped = true ;
                }
            }
            if(swapped == false){
                break ;
            }
        }
        return nums[nums.length/2];
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

        int ans = majorityElement(nums) ;
        System.out.println(ans);
    }
}
