//Problem Link : https://leetcode.com/problems/maximum-repeating-substring/

package com.ateeth.LeetCodeDSA.strings.easy;
import java.util.Scanner;

public class MaximumRepeatingSubString {
    public static int maxRepeating(String sequence, String word) {
        int ctr = 0 ;
        StringBuilder sb = new StringBuilder(word) ;
        while(sequence.contains(sb)){
            ++ctr ;
            sb.append(word) ;
        }
        return ctr ;
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in) ;
        System.out.println("Enter the string : ");
        String str = sc.next() ;

        System.out.println("Enter the string 2 : ");
        String str1 = sc.next() ;

        int ans = maxRepeating(str , str1) ;
        System.out.println(ans);
    }
}
