//Problem Link : https://leetcode.com/problems/excel-sheet-column-title/
package com.ateeth.LeetCodeDSA.math.easy.Important;

import java.util.Scanner;

public class ExcelColumnTitleSheet {
    /*  Consider getting the characters for 28: It's 26^1 * (first Character) + 26^0 * (second Character),
    which in this case is 26*'A' + 1*'B' . Therefore to get the last character mod by 26.
    Then to get the character prior to that divide by 26 then mod by 26 and so on till what remains is zero.
     */
    public static String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();

        while(n>0){
            n--;
            result.insert(0, (char)('A' + n % 26));
            n /= 26;
        }

        return result.toString();
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in) ;
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        String ans = convertToTitle(n) ;
        System.out.println(ans);
    }
}
