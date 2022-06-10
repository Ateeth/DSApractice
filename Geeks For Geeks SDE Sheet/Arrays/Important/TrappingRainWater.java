//Problem Link : https://www.geeksforgeeks.org/trapping-rain-water/
package com.ateeth.GeeksForGeeksDSA.SDESheet.Arrays.Important;

import java.util.Scanner;

public class TrappingRainWater {
    public static long trappingWater(int arr[], int n) {

        /*
            Note : create 2 more arrays
            left array store the tallest building on the left of the current building
            right array store the tallest building on the right of the current building

            for dist formula = Minimum of (tallest building on left , tallest building on right) - height of current building
        */
        int[] left = new int[n] ;
        left[0] = arr[0] ;

        for(int i = 1 ; i < n ; ++i){
            left[i] = Math.max(left[i-1] , arr[i]) ;
        }

        int[] right = new int[n] ;
        right[n-1] = arr[n-1] ;

        for(int i = n-2 ; i >= 0 ; --i){
            right[i] = Math.max(right[i+1] , arr[i]) ;
        }

        long sum = 0 ;
        for(int i = 0 ; i < n ; ++i){
            sum += Math.min(left[i] , right[i]) - arr[i] ;
        }


        return sum ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter size of array : ");
        int n = sc.nextInt(); ;

        int[] arr = new int[n] ;
        System.out.println("Enter array elements : ");
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
        }
        System.out.println(trappingWater(arr, n));
    }
}
