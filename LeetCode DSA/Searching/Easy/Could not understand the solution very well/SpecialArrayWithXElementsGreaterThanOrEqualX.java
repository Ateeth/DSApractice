//Problem Link : https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
package com.ateeth.LeetCodeDSA.searching.easy.HadDifficultyUnderstandingTheSolution;

import java.util.Arrays;
import java.util.Scanner;

public class SpecialArrayWithXElementsGreaterThanOrEqualX {

    public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        // binary search to find the first position that
        // nums[i] >= len - i and nums[i - 1] < len - i
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= len - mid) {
                // treat index 0 to avoid IndexOutOfBoundError
                if (mid == 0 || nums[mid - 1] < len - mid) { // correct index
                    return len - mid;
                } else { // not the first position, shrink right bound
                    right = mid - 1;
                }
            } else { // otherwisem, shrink the left bound to increase nums[mid]
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt()  ;

        int[] arr = new int[n] ;
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        int ans = specialArray(arr) ;
        System.out.println(ans);
    }
}
