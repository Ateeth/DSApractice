//Problem link : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

package com.ateeth.LeetCodeDSA.arrays.easy.CouldNotThinkOfOptimalSolution;

import java.util.Scanner;

public class FindNumbersWithEvenNumberOfDigits {

    //Optimal method
    public static int findNumbers(int[] nums) {
        int ctr = 0 ;
        for( int x : nums){
            if(((int)Math.log10(x) + 1) % 2 == 0){
                ++ctr ;
            }
        }
        return ctr ;
    }


    /*Method 2

    public static int findNumberOfDigits(int x){
        int n = 0 ;
        if(x == 0){
            return 1 ;
        }
        while(x > 0){
            x = x / 10 ;
            ++n ;
        }
        return n ;
    }

    public static int findNumbers(int[] nums) {
        int ctr = 0 ;
        for(int i = 0 ; i < nums.length ; ++i){
            int noOfDig = findNumberOfDigits(nums[i]) ;
            if(noOfDig % 2 ==0){
                ++ctr ;
            }
        }
        return ctr;
    }
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n  ;
        System.out.println("Enter the size of the integer array : ") ;
        n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter the values in the array : ");
        for(int i = 0 ; i< n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        int ans = findNumbers(arr) ;
        System.out.println(ans);
    }
}
