//Question Link : https://leetcode.com/problems/maximum-product-of-three-numbers/
package com.ateeth.LeetCodeDSA.math.easy.CouldNotThinkOfOptimalSolution;

import java.util.*;

public class MaximumProductOfThreeNumbers {
    /*
     public static int maximumProduct(int[] nums) {
        Arrays.sort(nums) ;
        return Math.max((nums[0] * nums[1] * nums[nums.length-1]) , (nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]));
     }
    */

    public static int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }

            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }
        return Math.max(max1*max2*max3, max1*min1*min2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter size of the array : ");
        int n = sc.nextInt() ;
        System.out.println("Enter elements of the array : ");
        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
        }
        System.out.println(maximumProduct(arr));
    }
}
