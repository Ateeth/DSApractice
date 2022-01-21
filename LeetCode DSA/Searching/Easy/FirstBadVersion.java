//Problem Link : https://leetcode.com/problems/first-bad-version/
package com.ateeth.LeetCodeDSA.searching.easy;

/*
Note this code won't work here as a predefined api is used. The following function will
be able to work on leetcode perfectly
 */

import java.util.Scanner;

public class FirstBadVersion {
/*
    public static int firstBadVersion(int n) {
        int beg = 1 , end = n , ans = 0 ;
        while(beg <= end){
            int mid = beg + (end - beg) / 2 ;
            if(isBadVersion(mid) == true){
                ans = mid ;
                end = mid - 1 ;
            }else{
                beg = mid + 1 ;
            }
        }
        return ans ;
    }
*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number : ");
        int n = sc.nextInt() ;
      //  int ans = firstBadVersion(n) ;
       // System.out.println(ans);
    }
}
