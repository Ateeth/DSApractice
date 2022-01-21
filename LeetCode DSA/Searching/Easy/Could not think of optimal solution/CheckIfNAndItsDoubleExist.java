//Problem Link : https://leetcode.com/problems/check-if-n-and-its-double-exist/
package com.ateeth.LeetCodeDSA.searching.easy.CouldNotThinkOfOptimalSolution;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIfNAndItsDoubleExist {
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr) ;
        for(int i = 0 ; i < arr.length;  ++i){
            if(arr[i] % 2 == 0 && binarySearch(arr,arr[i]/2,i)){
                //if even number look for its half if exist
                //we can assume it to be a double and see if its half exist
                return true ;
            }else if(binarySearch(arr,2*arr[i],i)){ //if odd number look for its double if exist
                return true ;
            }
        }
        return false ;
    }

    public static boolean binarySearch(int[] arr , int target , int index) {
        Arrays.sort(arr) ;
        int start = 0 , end = arr.length - 1 ;
        while(start <= end){
            int mid = start+ (end - start) / 2 ;
            if(arr[mid] == target && mid != index){
                return true ;
            }else if(arr[mid] < target){
                start = mid + 1 ;
            }else{
                end = mid - 1 ;
            }
        }
        return false ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter the array elements : ");
        for(int i = 0 ; i < n ; ++i ){
            arr[i] = sc.nextInt() ;
        }


        boolean ans = checkIfExist(arr) ;
        System.out.println(ans);
    }
}
