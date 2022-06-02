//Question Link : https://leetcode.com/problems/split-two-strings-to-make-palindrome/
package com.ateeth.LeetCodeDSA.strings.Medium.CouldNotThinkOfOptimalSolution;

/*
Explanation
*    Given 2 strings a and b, split each string into two part prefix and suffix, 
    return whether the combination aprefix + bsuffix or bprefix + asuffix is palindrome.
*   Because we have to return whether either of those combinations is palindrome, so we need a helper function.
*   In the helper function, the idea is to:
        **  Trim the prefix of the first string and the suffix of the second string (that we've know that if we concat them, we'll have a palindrome).
        **  Then check whether the middle part of the first string or the second string is a palindrome, if one of those part are palindrome, we can return true.
        **  E.x: a = "abdedef" and b = "feccfab":
        **  We'll trim the suffix "ef" of string a and the prefix "fe" of string b because "effe" is a palindrome.
        **  We are left with "ded" and "ccf", because "ded" are palindrome, we return true.
        **  The palindrome we got is "efdedfe" as we split a and b at index 4.

 */
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
