//Problem Link : https://leetcode.com/problems/sort-colors/
package com.ateeth.LeetCodeDSA.sorting.medium.VeryImportant;

import java.util.Arrays;
import java.util.Scanner;

/*
Algorithm :
THIS IS DUTCH NATIONAL FLAG ALGO
Keep three indices low = 0, mid = 0 and high = N - 1 and there are four ranges,
    i)1 to low (the range containing 0)
    ii) low to mid (the range containing 1)
    iii) mid to high (the range containing unknown elements)
    iv) high to N (the range containing 2).
Traverse the array from start to end and mid is less than high.
If the element is 0 then swap the element with the element at index low and update low = low + 1 and mid = mid + 1
If the element is 1 then update mid = mid + 1
If the element is 2 then swap the element mid with the element at index high and update high = high – 1
 update i = i – 1. As the swapped element is not processed
Print the array.
 */

/*
Another Approach : count the number of 0s 1s and 2s
create a new array and append it to that array like the correct number of 0s 1s 2s after each other
 */
public class SortColours {
    public static int[] sort012(int[] arr){
        int low = 0 , mid = 0 , high = arr.length - 1 , temp ;
        while(mid <= high){
            switch(arr[mid]){
                case 0 : temp = arr[mid] ;
                    arr[mid] = arr[low] ;
                    arr[low] = temp ;
                    ++low ;
                    ++mid ;
                    break ;

                case 1 : ++mid ;
                    break ;

                case 2 : temp = arr[mid] ;
                    arr[mid] = arr[high] ;
                    arr[high] = temp ;
                    --high ;
                    break ;
            }
        }
        return arr ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        int[] ans = sort012(arr) ;
        System.out.println(Arrays.toString(ans));
    }
}
