//Problem Link : https://leetcode.com/problems/relative-sort-array/
package com.ateeth.LeetCodeDSA.sorting.easy.CouldNotThinkOfOptimalSolution;

import java.util.Arrays;
import java.util.Scanner;

public class RelativeSortArray {

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int largest = 0;
        // get the largest element from arr1
        for(int i=0; i<arr1.length; i++)
            largest = Math.max(arr1[i], largest);

        // create an array of size (largest+1) to store frequencies of elements in arr1
        int[] frequencies = new int[largest+1];
        for(int i=0; i<arr1.length; i++)
            frequencies[arr1[i]]++;

        int index = 0;
        for(int i=0;  i<arr2.length;  i++){
            // insert the current element of arr2 till freqeuncy of this element in arr1 becomes 0
            while((frequencies[arr2[i]]--) > 0)
                arr1[index++] = arr2[i];
        }

        // insert the remaining elements of arr1 as per their frequencies  which were not present in arr2
        for(int i=0;  i<frequencies.length;  i++){
            while((frequencies[i]--) > 0)
                arr1[index++] = i;
        }
        return arr1;
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

        int[] ans = relativeSortArray(nums1 , nums2) ;
        System.out.println(Arrays.toString(ans));
    }
}
