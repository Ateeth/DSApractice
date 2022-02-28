//Problem Link : https://leetcode.com/problems/to-lower-case/
package com.ateeth.LeetCodeDSA.strings.easy;

import java.util.Scanner;

public class ToLowerCase {
    public static String toLowerCase(String str) {
        //return str.toLowerCase() ;

        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++)
            if ('A' <= a[i] && a[i] <= 'Z')
                a[i] = (char) (a[i] - 'A' + 'a');
        return new String(a);
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in) ;
        System.out.println("Enter the string : ");
        String str = sc.next() ;
        String ans = toLowerCase(str);
        System.out.println(ans);
    }
}
