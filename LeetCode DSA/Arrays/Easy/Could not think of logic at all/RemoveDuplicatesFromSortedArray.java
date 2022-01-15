//Problem link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
package com.ateeth.LeetCodeDSA.arrays.easy.CouldNotThinkOfLogicAtAll;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int ctr = 1;
        for(int i = 1; i< nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[ctr] = nums[i];
                // make the unique number in the ctr slot
                ctr += 1; //incrment ctr
            }
        }
        return ctr ; // this is the final array of unique elements upto ctr index
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt() ;

        System.out.println("Enter the elements of the array in increasing order : ");
        int[] array = new int[n] ;
        for(int i = 0 ; i < n ; ++i){
            array[i] = sc.nextInt() ;
        }

        int ans = removeDuplicates(array)  ;
        System.out.println(ans);
        System.out.println(Arrays.toString(array));
    }

}
