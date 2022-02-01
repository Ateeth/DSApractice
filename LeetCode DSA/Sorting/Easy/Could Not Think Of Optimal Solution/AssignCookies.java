//Problem Link : https://leetcode.com/problems/assign-cookies/
package com.ateeth.LeetCodeDSA.sorting.easy.CouldNotThinkOfOptimalSolution;

import java.util.Arrays;
import java.util.Scanner;

public class AssignCookies {
    /*
   To assign cookies to children optimaly we should give for each child the closest higher cookie.
   By using this greedy approach overall sum of wasted cookies will be minimum among all.
   To use this greedy solution in effective way we can sort both arrays and use two pointers.
    We should move pointer of children only if there is enough cookies to make that child content.
    In each step we will try to make content child at position pointerG by searching the closes higher cookie value.
   */

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int pointG = 0;
        int pointS = 0;

        while (pointG<g.length && pointS<s.length) {

            //child is content u can move on to the next child
            if (g[pointG]<=s[pointS]) {
                pointG++;
                pointS++;
            }
            //the current child is not yet content move to next cookie and remain on the same child
            else {
                pointS++;
            }
        }

        return pointG;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements of the first array : ");
        int n1 = sc.nextInt() ;

        int[] nums1 = new int[n1] ;
        System.out.println("Enter the elements of the first array : ");
        for(int i = 0 ; i < n1 ; ++i){
            nums1[i] = sc.nextInt() ;
        }

        System.out.println("Enter the number of elements of the second array : ");
        int n2 = sc.nextInt() ;

        int[] nums2 = new int[n2] ;
        System.out.println("Enter the elements of the second array : ");
        for(int i = 0 ; i < n2 ; ++i){
            nums2[i] = sc.nextInt() ;
        }

        int ans = findContentChildren(nums1 , nums2) ;
        System.out.println(ans);
    }
}
