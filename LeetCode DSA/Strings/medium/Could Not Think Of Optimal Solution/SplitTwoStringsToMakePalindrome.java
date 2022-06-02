//Question Link : https://leetcode.com/problems/split-two-strings-to-make-palindrome/
package com.ateeth.LeetCodeDSA.strings.Medium.CouldNotThinkOfOptimalSolution;

import java.util.* ;
public class SplitTwoStringsToMakePalindrome {
    public static boolean checkPalindromeFormation(String a, String b) {
        return split(a, b) || split(b, a);
    }

    private static boolean split(String a, String b) {
        int left = 0, right = a.length() - 1;
        while (left < right && a.charAt(left) == b.charAt(right)) {
            left++;
            right--;
        }
        if (left >= right) return true;
        return isPalindrome(a, left, right) || isPalindrome(b, left, right);
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the first string : ");
        String a = sc.next() ;
        System.out.println("Enter the second string : ");
        String b = sc.next() ;

        System.out.println(checkPalindromeFormation(a , b)) ;
    }
}
