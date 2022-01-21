//Problem Link : https://leetcode.com/problems/guess-number-higher-or-lower/
package com.ateeth.LeetCodeDSA.searching.easy;

import java.util.Scanner;

/*
Note this code won't work here as a predefined api is used. The following function will
be able to work on leetcode perfectly
 */
public class GuessNumberHigherOrLower {
/*
    public static int guessNumber(int n) {
        int beg = 1 , end = n ;
        while(beg <= end){
            int mid = beg + (end - beg) / 2 ;
            if(guess(mid) == 0){
                return mid ;
            }else if(guess(mid) == -1){
                end = mid - 1 ;
            }else{
                beg = mid + 1 ;
            }
        }

        return end ;
    }
*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number : ");
        int x = sc.nextInt();
  //      int ans = guessNumber(x) ;
    //    System.out.println(ans);
    }
}
