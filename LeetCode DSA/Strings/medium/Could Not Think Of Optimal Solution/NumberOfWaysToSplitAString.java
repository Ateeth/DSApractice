//Problem Link : https://leetcode.com/problems/number-of-ways-to-split-a-string/
package com.ateeth.LeetCodeDSA.strings.Medium.CouldNotThinkOfOptimalSolution;

//Article : https://leetcode.com/problems/number-of-ways-to-split-a-string/discuss/830455/JavaPython-3-Multiplication-of-the-ways-of-1st-and-2nd-cuts-w-explanation-and-analysis.

import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfWaysToSplitAString {
    public static int numWays(String s) {
        long M =  1_000_000_007 ;
        int n = s.length() ;
        int num_ones = 0 ;
        ArrayList<Integer> idxOnes = new ArrayList<>() ;

        for(int i = 0 ; i < s.length() ; ++i){
            if(s.charAt(i) == '1'){
                ++num_ones ;
                idxOnes.add(i) ;
            }
        }

        if(num_ones == 0){
            return (int)(((long)(n - 1) * (long)(n-2) / 2) % M) ;
        }

        if(num_ones % 3 != 0){
            return 0 ;
        }

        int num_ones_each_part = num_ones / 3 ;
        int idx1 = idxOnes.get(num_ones_each_part - 1) ;
        int idx2 = idxOnes.get(num_ones_each_part) ;
        int idx3 = idxOnes.get(num_ones_each_part * 2 - 1) ;
        int idx4 = idxOnes.get(num_ones_each_part * 2) ;
        return (int)((long)(idx2 - idx1) * (long)(idx4 - idx3) % M) ;
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in) ;
        System.out.println("Enter the string : ");
        String str = sc.next() ;

        int ans = numWays(str) ;
        System.out.println(ans);
    }
}
