//Problem link : https://www.geeksforgeeks.org/rearrange-array-maximum-minimum-form/
package com.ateeth.GeeksForGeeksDSA.SDESheet.Arrays.TrickyProblemNewConceptToPerformOptimally;

/*
We use the concept of dividend = quotient * divisor + remainder
remainder = old val
quotient = new value

this is used for O(1) space complexity

this can be done very easily in O(n) space complexity by creating another array
 */
import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayAlternatively {
    public static void rearrange(int[] arr){
        int max_idx = arr.length - 1 ;
        int min_idx = 0 ;
        int max = arr[arr.length - 1] + 1 ;

        for(int i = 0 ; i < arr.length ; ++i){
            if(i % 2 == 0){ // max elements will be there
                arr[i] = (arr[max_idx] % max) * max + arr[i] ;
                --max_idx ;
            }else{ // min elements will be there
                arr[i] = (arr[min_idx] % max) * max + arr[i] ;
                ++min_idx ;
            }
        }

        for(int i = 0 ; i < arr.length ; ++i){
            arr[i] /= max ;
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

        rearrange(arr);
    }
}
