//Problem Link : https://leetcode.com/problems/intersection-of-two-arrays/
package com.ateeth.LeetCodeDSA.sorting.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public static boolean binarySearch(int[] arr , int x){
        int beg = 0 , end = arr.length - 1 ;
        while(beg <= end){
            int mid = beg + (end - beg) / 2 ;
            if(arr[mid] == x){
                return true ;
            }else if(arr[mid] < x){
                beg = mid + 1 ;
            }else{
                end = mid - 1 ;
            }
        }
        return false ;
    }

    public static int[] intersection(int[] nums1 , int[] nums2){
        //To be able to perfirm binary search
        Arrays.sort(nums2);

        //HashSet to avoid duplicates
        HashSet<Integer> set = new HashSet<>() ;

        //loop nums1 and check if every element is in nums2 via binary search
        //if present in nums2 add to set
        for(int num : nums1){
            if(binarySearch(nums2 , num)){
                set.add(num) ;
            }
        }

        int[] res = new int[set.size()] ;
        int i = -1 ;

        //loop through set and add to results array
        for(int y : set){
            res[++i] = y ;
        }

        return res ;
    }

    /*
    Method 2 :
    Use two hash sets

Time complexity: O(n)


    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }

    Method 3:



Use two hash sets

Time complexity: O(n)

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }
}
Sort both arrays, use two pointers

Time complexity: O(nlogn)


    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[set.size()];
        int k = 0;
        for (Integer num : set) {
            result[k++] = num;
        }
        return result;
    }

     */
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

        int[] ans = intersection(nums1 , nums2) ;
        System.out.println(Arrays.toString(ans));
    }
}

