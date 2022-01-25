//Problem Link : https://leetcode.com/problems/koko-eating-bananas/
package com.ateeth.LeetCodeDSA.searching.medium.CouldNotThinkOfOptimalSolution;

import java.util.Scanner;

public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int H) {
        int l = 1, r = 1000000000; //r is 10^9
        while (l < r) {
            int m = (l + r) / 2, total = 0;
            for (int p : piles){
                total += p/m ; // this is pile value/ mid val i.e m is the assumed speed
                int rem = p % m ; // if any bananas are left in the pile after that hour
                if(rem > 0){ //some bananas are left in the pile so it will take one hour extra and so ++total
                    ++total ;
                }
            }
            if (total > H) //increase the speed by making start greater than mid
                l = m + 1;
            else
                r = m;
        }
        return l;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of piles : ");
        int n = sc.nextInt() ;

        System.out.println("Enter the value for all piles : ");
        int[] piles = new int[n] ;
        for(int i = 0 ; i < n ; ++i){
            piles[i] = sc.nextInt(); ;
        }

        System.out.println("Enter the value for H : ");
        int H = sc.nextInt();

        int ans = minEatingSpeed(piles , H)  ;
        System.out.println(ans);
    }
}
