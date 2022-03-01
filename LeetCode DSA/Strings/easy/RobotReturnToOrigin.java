//Problem Link : https://leetcode.com/problems/robot-return-to-origin/
package com.ateeth.LeetCodeDSA.strings.easy;

import java.util.Scanner;

public class RobotReturnToOrigin {
    public static boolean judgeCircle(String moves) {
        int distHorizontal = 0  , distVertical = 0;
        for(int i = 0 ; i < moves.length() ; ++i){
            if(moves.charAt(i) == 'U'){
                ++distVertical ;
            } else if(moves.charAt(i) == 'D'){
                --distVertical ;
            } else if (moves.charAt(i) == 'L'){
                --distHorizontal ;
            } else if (moves.charAt(i) == 'R'){
                ++distHorizontal ;
            }
        }

        return distHorizontal == 0 && distVertical == 0 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.next();

        boolean ans = judgeCircle(str) ;
        System.out.println(ans);
    }
}
