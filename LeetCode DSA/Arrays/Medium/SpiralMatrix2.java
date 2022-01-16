//Problem Link : https://leetcode.com/problems/spiral-matrix-ii/
package com.ateeth.LeetCodeDSA.arrays.medium;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrix2 {

        public static int[][] generateMatrix(int n) {
            int[][] matrix = new int[n][n] ;
            int rs  = 0 , re = n - 1 , cs = 0 , ce = n - 1 ;
            int ctr = 1 ;

            while( ctr <= (n*n) && rs <= re && cs <= ce ){
                //traverse start row
                for(int i = cs ; i <= ce ; ++i){
                    matrix[rs][i] = ctr ;
                    ++ctr ;
                }
                //increment start row
                ++rs ;

                //traverse ende column
                for(int i = rs ; i <= re ; ++i){
                    matrix[i][ce] = ctr ;
                    ++ctr ;
                }
                //decrement end column
                --ce ;

                if(ctr <= (n*n) && rs <= re && cs <= ce){
                    //traverse end row
                    for(int i = ce ; i >= cs ; --i){
                        matrix[re][i] = ctr ;
                        ++ctr ;
                    }
                    //decrement end row
                    --re ;

                    //traverse start column
                    for(int i = re ; i >= rs ; --i){
                        matrix[i][cs] = ctr ;
                        ++ctr ;
                    }
                    //incrment start column
                    ++cs ;
                }
            }

            return matrix ;
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in) ;
            System.out.println("Enter the value of n : ");
            int n = sc.nextInt() ;

            int[][] ans = generateMatrix(n) ;

            for(int i = 0 ; i < n ; ++i){
                System.out.println(Arrays.toString(ans[i]));
                System.out.println();
            }
        }
    }


