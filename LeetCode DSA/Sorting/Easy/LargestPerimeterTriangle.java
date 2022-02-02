//Problem Link : https://leetcode.com/problems/largest-perimeter-triangle/
package com.ateeth.LeetCodeDSA.sorting.easy;

import java.util.Arrays;
import java.util.Scanner;

public class LargestPerimeterTriangle {

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 3; i >= 0; --i){
            //the sum of 2 shorter sides is greater than the largest size
            if (nums[i] + nums[i+1] > nums[i+2]){
                return nums[i] + nums[i+1] + nums[i+2];
            }
        }
        return 0;
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

        int ans = largestPerimeter(arr) ;
        System.out.println(ans);
    }
}
