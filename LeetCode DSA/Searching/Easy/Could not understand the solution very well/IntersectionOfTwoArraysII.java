//Problem Link : https://leetcode.com/problems/intersection-of-two-arrays-ii/
package com.ateeth.LeetCodeDSA.searching.easy.HadDifficultyUnderstandingTheSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IntersectionOfTwoArraysII {

    public static int binarySearch(int[] arr , int target){
        int beg = 0 , end = arr.length - 1  , res = -1;
        while(beg <= end){
            int mid = beg + (end - beg) / 2 ;

            //look in the left half of array
            if(arr[mid] > target){
                end = mid - 1 ;
            }else if(arr[mid] < target){
                beg = mid + 1 ;
            }else{
                /*
                    Possible ans so store the index then make
                    beg = mid + 1 to see if any more possible answers
                 */
                res = mid ;
                beg = mid + 1 ;
            }
        }
        return res ;
    }

    public static int[] intersect(int[] nums1 , int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int len1 = nums1.length;
        int len2 = nums2.length;

        int[] longer;
        int[] shorter;

        if (len1>len2) {
            longer = nums1;
            shorter = nums2;
        } else {
            longer = nums2;
            shorter = nums1;
        }

        boolean[] taken = new boolean[longer.length] ;
        List<Integer> intersection = new ArrayList<Integer>() ;

        for(int i = 0 ; i < shorter.length ; ++i){
            //Find the last index of occurence of element in larger
            int idx = binarySearch(longer , shorter[i]) ;

            //if element not found
            if( idx == -1 ){
                continue ;
            }

            /*
                Find if element at returned idx has already been included
                If already included we can look for an occurrence in previous index
                ans include
             */
            while( idx >=0 && taken[idx] == true && longer[idx] == shorter[i]){
                /*
                keep decrementing idx till another occurrence of shorter[i]
                and the index must not have been taken
                 */
                --idx ;
            }

            /*
                a possible index has been found
                also longer[idx] == shorter[i]
             */
            if(idx > -1 && longer[idx] == shorter[i]) {
                /*
                make taken[idx] = true
                and add shorter[i] / longer[idx] to intersection ArrayList
                 */
                taken[idx] = true;
                intersection.add(shorter[i]);
            }
        }

        //now store elements of intersection idx into an array and return it
        int[] ansArray = new int[intersection.size()] ;
        int i = -1 ;
        for(int num :intersection){
            ansArray[++i] = num ;
        }
        return ansArray ;

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

        int[] ans = intersect(nums1 , nums2) ;
        System.out.println(Arrays.toString(ans));
    }
}
