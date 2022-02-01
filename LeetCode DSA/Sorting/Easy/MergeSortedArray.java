//Problem Link : https://leetcode.com/problems/merge-sorted-array/
package com.ateeth.LeetCodeDSA.sorting.easy;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        /*
        create nums3 array and put all elements of nums1 till m index in nums3
        */
        int[] nums3 = new int[m] ;

        for(int i = 0 ; i < m ; ++i ){
            nums3[i] = nums1[i] ;
        }

        int ctr1 = 0 ,  ctr2 = 0 , ctr = 0 ;

        /*
            use 2 pointers starting from nums2 and nums3
            ctr to traverse nums1
            ctr1 to traverse nums3
            ctr2 to traverse nums2
        */
        while(ctr1 < m && ctr2 < n){
            /*
                the element in nums3 at ctr1 pos is less than or equal to
                element in nums2 at ctr2 pos

                so add the ctr1 element in nums3 to ctr at nums1
            */
            if(nums3[ctr1] <= nums2[ctr2]){
                nums1[ctr] = nums3[ctr1] ;
                ++ctr ;
                ++ctr1 ;
            }
             /*
                the element in nums3 at ctr1 pos is greater than
                element in nums2 at ctr2 pos

                so add the ctr2 element in nums2 to ctr at nums1
            */
            else{
                nums1[ctr] = nums2[ctr2] ;
                ++ctr ;
                ++ctr2 ;
            }
        }

        /*
        As the above loop is broken we have traversed nums2 or nums3 entirely now we will
        add remaining elements of the other array
        */

        /*
        If some elements of nums3 r left to be added to nums1 just add them to nums1
        */
        if(ctr1 < m){
            for(int i = ctr1 ; i < m ; ++i){
                nums1[ctr] = nums3[i] ;
                ++ctr ;
            }
        }
        /*
        If some elements of nums2 r left to be added to nums1 just add them to nums1
        */
        else{
            for(int i = ctr2 ; i < n ; ++i){
                nums1[ctr] = nums2[i] ;
                ++ctr ;
            }
        }

        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter the number of elements for nums1 : ");
        int m = sc.nextInt() ;

        System.out.println("Enter the number of elements for nums2 : ");
        int n = sc.nextInt();

        int[] nums1 = new int[m + n]  ;
        System.out.println("Enter the elements in nums1 : ");
        for(int i = 0 ; i < m ; ++i){
            nums1[i] = sc.nextInt() ;
        }

        int[] nums2 = new int[n]  ;
        System.out.println("Enter the elements in nums2 : ");
        for(int i = 0 ; i < n ; ++i){
            nums2[i] = sc.nextInt() ;
        }

        merge(nums1 , m , nums2 , n);
    }
}
