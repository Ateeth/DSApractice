//Problem Link : https://leetcode.com/problems/squares-of-a-sorted-array/
package com.ateeth.LeetCodeDSA.sorting.easy.CouldNotThinkOfOptimalSolution;

import java.util.Arrays;
import java.util.Scanner;

public class SquaresOfASortedArray {

    /*
        The crux over here is that the array is already sorted.
        We are comparing the first and last elements because after square
            these have the possibility of being the highest element.
        Both the extremes contain the max element (after square of course),
            so we are inserting these elements to the last of the new array to make it sorted.
*/
    public static int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
        int start = 0, end = A.length-1;
        int resIndex = A.length-1;

        while(start <= end){
            if(A[start]*A[start] > A[end]*A[end]){
                res[resIndex--] = A[start]*A[start];
                start++;
            }else{
                res[resIndex--] = A[end]*A[end];
                end--;
            }
        }

        return res;
    }

    /*
    Brute force method
    public static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length] ;
        for(int i = 0 ; i < nums.length ; ++i){
            ans[i] = nums[i] * nums[i] ;
        }
        Arrays.sort(ans) ;
        return ans ;
    }
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; ++i ){
            arr[i] = sc.nextInt() ;
        }

        int[] ans = sortedSquares(arr) ;
        System.out.println(Arrays.toString(ans));
    }
}
