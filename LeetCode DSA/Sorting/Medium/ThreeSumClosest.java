//Problem Link : https://leetcode.com/problems/3sum-closest/
package com.ateeth.LeetCodeDSA.sorting.medium;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum, minSum = nums[0] + nums[1] + nums[2] - target;
        for (int i = 0; i < nums.length - 2; ++i) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                sum = nums[i] + nums[low] + nums[high];
                if (Math.abs(target - sum) < Math.abs(target - minSum)) {
                    minSum = sum;
                }

                if (minSum == target) {
                    return minSum;
                }

                if (sum > target) {
                    --high;
                } else {
                    ++low;
                }
            }
        }
        return minSum ;
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

        System.out.println("Enter the target : ");
        target = sc.nextInt() ;

        int ans = threeSumClosest(arr , target) ;
        System.out.println(ans);
    }
}
