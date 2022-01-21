//Problem Link : https://leetcode.com/problems/fair-candy-swap/
package com.ateeth.LeetCodeDSA.searching.easy.CouldNotThinkOfOptimalSolution;

import java.util.Arrays;
import java.util.Scanner;

public class FairCandySwap {

    /*
        Let alice have Sa total , bob have Sb total
        Let alice give x bob give y candies
        Sa - x  + y = Sb - y + x
        Sa - Sb + 2y = 2x
        x = y + (Sa - Sb) / 2
        Return this x and y values
    */

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;

        //find sum of alice candies
        for(int x : aliceSizes){
            sumA += x ;
        }

        //find sum of bob candies
        for(int x : bobSizes){
            sumB += x ;
        }

        //for binary search in bobSizes
        Arrays.sort(bobSizes) ;

        //equation x = y + (Sa - Sb) / 2
        int diff = (sumA - sumB)/2;

         /*
            for all elements in aliceSizes look if corresponding element in bobSizes
            i.e element - diff must be present in bobSizes use binary search
            if found return the array of [element , element-diff]
         */
        for(int x : aliceSizes ){
            if(binarySearch(bobSizes , x - diff) != -1){
                return new int[]{x,x - diff} ;
            }
        }
        return null;
    }

    public static int binarySearch(int[] bobSizes , int target){
        int start = 0 ;
        int end = bobSizes.length - 1 ;
        while(start <= end){
            int mid = start + (end-start) / 2  ;
            if(bobSizes[mid] == target){
                return bobSizes[mid] ;
            }else if(bobSizes[mid] < target){
                start = mid + 1 ;
            }else{
                end = mid - 1 ;
            }
        }
        return -1 ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements of the first array : ");
        int n1 = sc.nextInt() ;

        int[] nums1 = new int[n1] ;
        System.out.println("Enter the elements of the first array : ");
        for(int i = 0 ; i < n1 ; ++i){
            nums1[i] = sc.nextInt() ;
        }

        System.out.println("Enter the number of elements of the second array : ");
        int n2 = sc.nextInt() ;

        int[] nums2 = new int[n2] ;
        System.out.println("Enter the elements of the second array : ");
        for(int i = 0 ; i < n2 ; ++i){
            nums2[i] = sc.nextInt() ;
        }

        int[] ans = fairCandySwap(nums1 , nums2) ;
        System.out.println(Arrays.toString(ans));
    }

}
