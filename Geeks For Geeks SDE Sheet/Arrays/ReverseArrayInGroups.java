//Problem Link : https://www.geeksforgeeks.org/reverse-an-array-in-groups-of-given-size/
package com.ateeth.GeeksForGeeksDSA.SDESheet.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayInGroups {
    public static void reverseInGroups(int[] arr, int n, int k) {

        //increment i by k as i will denote the start pos of each subgroup
        for(int i = 0 ; i < n ; i += k){
            int start = i ;

            //if less than k elements left make end index as n - 1
            //if k element subgroup can be made start + k - 1 can be the end index
            int end = Math.min(start + k - 1 , n - 1) ;
            while(start < end  ){
                //Swap start and end elements
                int temp = arr[start] ;
                arr[start] = arr[end] ;
                arr[end] = temp ;
                ++start ;
                --end ;
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
        System.out.println("Enter value of k : ");

        int k = sc.nextInt() ;
        reverseInGroups(arr, n , k);
    }
}
