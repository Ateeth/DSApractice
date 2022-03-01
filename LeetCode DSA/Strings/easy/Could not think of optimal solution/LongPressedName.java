//Problem Link : https://leetcode.com/problems/long-pressed-name/
package com.ateeth.LeetCodeDSA.strings.easy.CouldNotUnderstandOptimalSolution;

import java.util.Scanner;

public class LongPressedName {
    public static boolean isLongPressedName(String name, String typed) {
        int i = 0;
        //loop through typed
        int j = 0 ;
        while(j < typed.length()){
            //character in name is same as in typed move to next character of name
            if (i < name.length() && name.charAt(i) == typed.charAt(j)){
                ++i;
            }
            //if j == 0 first character itself is not matching with name it is not long             //press
            // if character at j pos not equal to before character and was not caught
            //by first if condition return false
            else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)){
                return false;
            }
            ++j ;
        }

        //if i == m it has traversed the whole name and hence it may be long press
        return i == name.length();
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in) ;
        System.out.println("Enter the string : ");
        String str = sc.next() ;

        System.out.println("Enter the string 2 : ");
        String str1 = sc.next() ;

        boolean ans = isLongPressedName(str , str1) ;
        System.out.println(ans);
    }
}
