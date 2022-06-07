//Problem Link : https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
package com.ateeth.LeetCodeDSA.Recursion.Easy;

import java.util.Scanner;

public class FindFirstUpperCaseLetterInString {
    public static void findUpperCase(String s , int idx){
        if(idx == s.length()){
            System.out.println("No upper case character found !!!!!!");
            return;
        }

        char ch = s.charAt(idx) ;

        if(ch >= 'A' && ch <= 'Z'){
            System.out.println(ch);
            return;
        }

        findUpperCase(s , idx + 1) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the string : ");
        String s = sc.next();

        findUpperCase(s , 0);
    }
}
