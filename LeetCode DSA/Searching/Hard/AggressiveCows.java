//Problem Link : https://www.spoj.com/problems/AGGRCOW/
//Youtube video : https://youtu.be/wSOfYesTBRk

package com.ateeth.LeetCodeDSA.searching.hard;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public static boolean isPossible(int[] a, int n, int cows, int minDist) {
        int cntCows = 1;
        int lastPlacedCow = a[0];
        for(int i = 1;i<n;i++) {
            if(a[i] - lastPlacedCow >= minDist) {
                cntCows++;
                lastPlacedCow = a[i];
            }
        }
        if(cntCows >= cows) return true;
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int t;
        System.out.println("Enter the number of test cases : ");
        t = sc.nextInt() ;
        while(t > 0) {
            int n, cows;
            System.out.println("Enter the value of n : ");
            n = sc.nextInt() ;

            System.out.println("Enter the number of cows : ");
            cows = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the various distances : ");
            for(int i = 0; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr) ;

            //minimum possible dist is 1
            int low = 1;

            //maximum possible dist is diff of last and first elements
            int high = arr[n-1] - arr[0];

            while(low <= high) {
                int mid = (low + high) >> 1;

                //is this distance possible as min distance look for a greater value
                //by incrementing low
                if(isPossible(arr,n,cows,mid)) {
                    low = mid + 1;
                }

                //current coordinate not possible as min distance
                //so reduce high to mid - 1
                else {
                    high = mid - 1;
                }
            }
            System.out.println(high);
            --t ;
        }
    }
}

