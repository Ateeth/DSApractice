//Problem Link : https://www.geeksforgeeks.org/k-th-element-two-sorted-arrays/
package com.ateeth.GeeksForGeeksDSA.SDESheet.Arrays;

import java.util.Scanner;
/*
Use 2 pointer approach for both arrays and when ctr of element == k print it
 */
public class KthElementOfTwoSortedArrays {
    public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int ptr1 = 0 , ptr2 = 0 ;
        int ctr = 0 ;
        int element = 0 ;

        while(ptr1 < n && ptr2 < m){

            if(arr1[ptr1] <= arr2[ptr2]){

                System.out.print(arr1[ptr1] + " ") ;
                ++ptr1 ;
                ++ctr ;
                if(ctr == k){
                    return arr1[ptr1 - 1] ;
                }
            }

            else {
                System.out.print(arr2[ptr2] + " ") ;
                ++ptr2 ;
                ++ctr ;
                if(ctr  == k){
                    return arr2[ptr2 - 1] ;
                }

            }

        }

        while(ptr1 < n){
            System.out.print(arr1[ptr1] + " ") ;
            ++ptr1 ;
            ++ctr ;
            if(ctr == k){
                return arr1[ptr1 - 1] ;
            }
        }

        while(ptr2 < m){
            System.out.print(arr2[ptr2] + " ") ;
            ++ptr2 ;
            ++ctr ;
            //  System.out.println(arr2[ptr2]) ;
            if(ctr == k){
                return arr2[ptr2 - 1] ;
            }
        }


        return -1 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int m = sc.nextInt() ;
        int k = sc.nextInt();

        int[] arr1 = new int[n] ;
        for(int i = 0 ; i < n ; ++i){
            arr1[i]  = sc.nextInt() ;
        }

        int[] arr2 = new int[m] ;
        for(int i = 0 ; i < m ; ++i){
            arr2[i]  = sc.nextInt() ;
        }

        System.out.println(kthElement(arr1 , arr2 , n , m , k));
    }
}
