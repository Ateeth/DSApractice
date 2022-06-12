//Problem Link : https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
package com.ateeth.GeeksForGeeksDSA.SDESheet.Arrays.Important;

import java.util.Arrays;
import java.util.Scanner;

public class Sort012DNFMethod {
    public static void sort012(int a[], int n)
    {
        int low = 0 , high = n - 1 , mid = 0 , temp ;

        while(mid <= high){
            switch(a[mid]){
                case 0 :
                    temp = a[low] ;
                    a[low] = a[mid] ;
                    a[mid] = temp ;
                    ++low ;
                    ++mid ;
                    break ;

                case 1 :
                    ++mid ;
                    break ;

                case 2 :
                    temp = a[high] ;
                    a[high] = a[mid] ;
                    a[mid] = temp ;
                    --high ;
            }
        }

        System.out.println(Arrays.toString(a));
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
        sort012(arr, n);
    }
}
