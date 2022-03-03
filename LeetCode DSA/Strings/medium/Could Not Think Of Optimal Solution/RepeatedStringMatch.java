//Problem Link : https://leetcode.com/problems/repeated-string-match/
package com.ateeth.LeetCodeDSA.strings.Medium.CouldNotThinkOfOptimalSolution;

import java.util.Scanner;

public class RepeatedStringMatch {
    /*
    n: length of a, m: length of b , k = n / m ~= constant
    TC: O(nm * k) ~= O(nm), each iteration StringBuilder content size will grow at most n size but it will repeat constant times.
    Then we can asuume time complexity will be O(nm)
    SC: O(kn) ~= O(n)
    */
    public static int repeatedStringMatch(String a, String b) {
        StringBuilder strA = new StringBuilder(a) ;
        int repeat = b.length() / a.length() + 2 ;
        //Here repeat = b.length()/a.length() as this is minimum number of times
        // a needs to be appended to itself to make a substring of itself
        //+2 as if we consider append at a beginning or end
        //The idea is to keep string builder and appending until the length A is greater or equal to B.
        int ctr = 1 ;
        for(int i = 0 ; i < repeat ; ++i){
            //b is a substring of strA
            if(strA.indexOf(b) != -1){
                return ctr ;
            }else{
                strA.append(a) ;
                ++ctr ;
            }
        }
        return -1 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();

        System.out.println("Enter the string : ");
        String str1 = sc.nextLine();

        int ans = repeatedStringMatch(str , str1) ;
        System.out.println(ans);
    }
}
