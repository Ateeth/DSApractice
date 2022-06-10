//Problem Link : https://www.geeksforgeeks.org/find-subarray-with-given-sum/
package com.ateeth.GeeksForGeeksDSA.SDESheet.Arrays.Important;

import java.util.* ;
public class SubArrayWithGivenSum {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> ans = new ArrayList<>() ;
        int sum = 0 , start = 0 ;
        int i ;
        for(i = 0 ; i < n ; ++i){
            sum += arr[i] ;
            while(sum > s){
                sum -= arr[start] ;
                ++start ;
            }
            if(sum == s){
                ans.add(start + 1) ;
                ans.add(i + 1) ;
                return ans ;
            }
        }

        ans.add(-1) ;
        return ans ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();

        System.out.println("Enter array elements : ");
        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target sum : ");
        int s = sc.nextInt();

        System.out.println(subarraySum(arr , n , s));
    }
}
