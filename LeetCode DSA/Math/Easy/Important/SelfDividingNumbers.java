//Problem Link : https://leetcode.com/problems/self-dividing-numbers/
package com.ateeth.LeetCodeDSA.math.easy.Important;

import java.util.* ;
public class SelfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arr = new ArrayList<>() ;

        for(int i = left ; i <= right ; ++i){
            if(isDivide(i) == 1){
                arr.add(i) ;
            }
        }

        return arr ;
    }

    public static int isDivide(int n){
        int x = n ;
        while(n > 0){
            int d = n % 10 ;
            if(d == 0){
                return 0;
            }
            if(x % d != 0 ){
                return 0 ;
            }
            n /= 10 ;
        }

        return 1 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value of left : ");
        int left = sc.nextInt() ;
        System.out.println("Enter the value of right : ");
        int right = sc.nextInt();
        System.out.println(selfDividingNumbers(left , right));
    }
}
