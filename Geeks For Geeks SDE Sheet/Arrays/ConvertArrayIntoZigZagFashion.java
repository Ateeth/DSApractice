//Problem Link : https://www.geeksforgeeks.org/convert-array-into-zig-zag-fashion/
package com.ateeth.GeeksForGeeksDSA.SDESheet.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertArrayIntoZigZagFashion {
     /*
    Check odd positions they need to be greater than their adjacent elements
    if odd pos element less than previous element swap
    if odd pos element more than next element swap
    */

    public static void zigZag(int arr[], int n) {
        for(int i = 1 ; i < n ; i += 2){
            if(arr[i] < arr[i-1]){
                int temp = arr[i] ;
                arr[i] = arr[i-1] ;
                arr[i-1] = temp ;
            }

            if(i < n - 1 && arr[i] < arr[i+1]){
                int temp = arr[i] ;
                arr[i] = arr[i+1] ;
                arr[i+1] = temp ;
            }
        }

        System.out.println(Arrays.toString(arr));
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

        zigZag(arr, n);
    }
}
