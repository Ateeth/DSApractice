//Problem link : https://leetcode.com/problems/shuffle-the-array/


/*Algo :
1. make ans array equal to nums array length
2. run a for loop 0 till n - 1
    i) make even positions of ans = nums[i] i.e ans[2*i] = nums[i]
    ii) make odd positions of ans = nums[i+n] i.e ans[2*i + 1] = nums[i + n]

 */
package com.ateeth.LeetCodeDSA.arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray {

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length] ;
        int i ;


        for( i = 0 ; i < n ; ++i){
            ans[2 * i] = nums[i] ;
            ans[2*i + 1] = nums[i + n] ;
        }
        return ans ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter size of the array : ") ;
        int len = sc.nextInt() ;

        int[] nums = new int[2 * len] ;
        System.out.println("Enter the elements of the array: ") ;
        for(int i = 0 ; i < nums.length ; ++i){
            nums[i] = sc.nextInt() ;
        }

        int[] ans = shuffle(nums , len) ;

        System.out.println(Arrays.toString(ans)) ;
    }
}
