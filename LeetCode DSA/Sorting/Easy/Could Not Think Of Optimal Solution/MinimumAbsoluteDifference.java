//Problem Link : https://leetcode.com/problems/minimum-absolute-difference/
package com.ateeth.LeetCodeDSA.sorting.easy.CouldNotThinkOfOptimalSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MinimumAbsoluteDifference {
    /*
    If a diff is lesser than current min clear the list and make min = diff
    if min == diff add it to result
    */
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList();
        //sort elements
        Arrays.sort(arr);
        //init our min difference value
        int min = Integer.MAX_VALUE;
        //start looping over array to find real min element. Each time we found smaller difference
        //we reset resulting list and start building it from scratch. If we found pair with the same
        //difference as min - add it to the resulting list
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff <= min) {
                if (diff < min) {
                    min = diff;
                    res.clear();
                }
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; ++i ){
            arr[i] = sc.nextInt() ;
        }

        List<List<Integer>> ans = minimumAbsDifference(arr) ;
        System.out.println(ans);
    }
}
