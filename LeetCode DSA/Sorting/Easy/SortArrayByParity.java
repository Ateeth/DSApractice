package com.ateeth.LeetCodeDSA.sorting.easy;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayByParity {

    /*
      Method in case extra space is allowed
      First add even elements to new array then add odd elements

     public int[] sortArrayByParity(int[] A) {
      int[] ans = new int[A.length];
       int t = 0;

       for (int i = 0; i < A.length; ++i)
           if (A[i] % 2 == 0)
               ans[t++] = A[i];

       for (int i = 0; i < A.length; ++i)
           if (A[i] % 2 == 1)
               ans[t++] = A[i];

       return ans;
   }
   */

    public static int[] sortArrayByParity(int[] arr) {


        int left = 0 , right = arr.length - 1 ;
        while(left <= right){

            //if left and right elements are even just increment left pointer
            if (arr[left] %2 == 0 && arr[right] %2 == 0)
                left++;

                // Condition to check if the left
                // pointer element is odd and
                // the right pointer element is even then swap them and increment left and right pointers
            else if (arr[left] %2 == 1 && arr[right] %2 == 0)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            // Condition to check if both the
            // elements are odd decrement the right pointer
            else if (arr[left] %2 == 1 && arr[right] % 2 == 1)
                right--;

            /*
            Left is even right is odd
            just increment left decrement right
             */
            else
            {
                left++;
                right--;
            }
        }
        return arr ;
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

        int[] ans = sortArrayByParity(arr) ;
        System.out.println(Arrays.toString(ans));
    }
}
