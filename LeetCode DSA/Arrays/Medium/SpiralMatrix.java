//Problem Link : https://leetcode.com/problems/spiral-matrix/
package com.ateeth.LeetCodeDSA.arrays.medium;

import java.util.ArrayList;
import java.util.Scanner;

public class SpiralMatrix {

    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>() ;
        int rs = 0 , cs = 0 , re = matrix.length - 1 , ce = matrix[0].length - 1 ;

        while(rs <= re && cs <= ce){
            //first go across starting row
            for(int i = cs ; i <= ce ; ++i){
                ans.add(matrix[rs][i]) ;
            }

            //increment value of rs after we covered the row
            ++rs ;

            //now go across the last column
            for(int i = rs ; i <= re ; ++i){
                ans.add(matrix[i][ce]) ;
            }

            //decrement value of last column after it is added to answer list
            --ce ;

            //recheck if initial condition is still valid else extra elements may be added
            if(rs <= re && cs <= ce){
                //go accross the last row
                for(int i = ce ; i >= cs ; --i){
                    ans.add(matrix[re][i]) ;
                }
                //decrement row end as we aldready covered it
                --re ;

                //go across start column now
                for(int i = re ; i >= rs ; --i){
                    ans.add(matrix[i][cs]) ;
                }
                //increment start column as aldready added its value
                ++cs ;
            }
        }

        return ans ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the dimensions of the matrix : ");
        int m = sc.nextInt() ;
        int n = sc.nextInt() ;

        System.out.println("Enter the elements of the matrix : ");
        int[][] matrix = new int[m][n] ;
        for(int i = 0 ; i < m ; ++i){
            for(int j = 0 ; j < n ; ++j){
                matrix[i][j] = sc.nextInt() ;
            }
        }

        ArrayList<Integer> ans  = spiralOrder(matrix) ;
        System.out.println(ans);
    }
}
