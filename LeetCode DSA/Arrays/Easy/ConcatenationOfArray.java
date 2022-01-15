//problem link : https://leetcode.com/problems/concatenation-of-array/
package com.ateeth.LeetCodeDSA.arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray {

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2] ;
        for(int i = 0 ; i < nums.length   ; ++i ){
            ans[i]  = nums[i] ;
            ans[i + nums.length] = nums[i] ;
        }

        return ans ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter size of the array : ") ;
        int len = sc.nextInt() ;

        int[] nums = new int[len] ;
        System.out.println("Enter the elements of the array: ") ;
        for(int i = 0 ; i < len ; ++i){
            nums[i] = sc.nextInt() ;
        }

        int[] ans = getConcatenation(nums) ;

        System.out.println(Arrays.toString(ans)) ;
    }
}
