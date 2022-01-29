//Problem Link  :https://curiouschild.github.io/leetcode/2019/06/21/divide-chocolate.html
/*
Very similar to min split array sum
Split Array Largest Sum which is to minimize the maximum
this is to maximize the minimum

 */
package com.ateeth.LeetCodeDSA.searching.hard.DidntUnderstandVeryWell;


import java.util.Scanner;

public class DivideChocolate {
    public static int splitArray(int[] nums, int m) {
        ++m ;
        long low = Integer.MAX_VALUE , high = 0 ;
        for(int x : nums){
            low = Math.min(x , low) ;
            high += x ;
        }
        while(low + 1 < high){
            long mid = low + (high - low) / 2 ;
            if (!canSplit(nums, m, mid)) {
                high = mid - 1;
            }

            else {
                low = mid;
            }
        }

        //if the last item can be split
        if(canSplit(nums, m, high)) return (int)high;
        return (int)low;
    }

    public static boolean canSplit(int[] nums, int m, long target) {
        long sum = 0, cnt = 0;
        for(int n : nums) {
            if(sum + n >= target) {
                sum = 0;
                cnt++;
            } else {
                sum += n;
            }
        }
        return cnt >= m;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt() ;

        System.out.println("Enter the elements of the array one by one : ");
        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt() ;
        }

        System.out.println("Enter the minimum number of splits : ");
        int m = sc.nextInt() ;

        int ans = splitArray(arr , m) ;
        System.out.println(ans);
    }
}
