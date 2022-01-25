//Problem Link : https://leetcode.com/problems/find-a-peak-element-ii/
package com.ateeth.LeetCodeDSA.searching.medium.CouldNotThinkOfOptimalSolution;

import java.util.Arrays;
import java.util.Scanner;

public class FindPeakElementII {

    public static int[] findPeakGrid(int[][] mat) {
        int srow = 0;
        int erow = mat.length-1;


        while(erow >= srow) {
            int midrow = srow + (erow - srow)/2;
            int gmax = maxi(mat[midrow], mat[midrow].length-1); //max element index in the row

            if (midrow == 0) { //first row
                if (mat[midrow][gmax] > mat[midrow + 1][gmax]) {//greater than the below element in same column as in first row maxindex greater than left and right no need to check the top
                    return new int[]{midrow, gmax};
                }
            }
            if (midrow == mat.length - 1) { //last row
                if (mat[midrow][gmax] > mat[midrow - 1][gmax]) { //greater than above element in same column
                    return new int[]{midrow, gmax};
                }
            }

            if (mat[midrow][gmax] > mat[midrow + 1][gmax] && mat[midrow][gmax] > mat[midrow - 1][gmax]) {
                //greater than abovr and below elements
                return new int[]{midrow, gmax};
            }
            if (mat[midrow][gmax] < mat[midrow + 1][gmax]) { //lesser tahn below element so start search than the below row
                srow = midrow+1;
            } else {
                erow = midrow -1; //it is greater than below row thats why end row goes to the above row
            }
        }
        return new int[]{-1, -1};

    }
    public static int maxi(int[] arr, int end) {
        int max = 0;


        for ( int i = 0; i <= end; i++){
            if (arr[i] > arr[max]){
                max = i;
            }
        }

        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of rows in the matrix : ");
        int r = sc.nextInt() ;
        System.out.println("Enter the number of columns in the matrix : ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c] ;
        System.out.println("Enter the elements of the matrix : ");
        for(int i = 0 ; i < r ; ++i){
            for(int j = 0 ; j < c ; ++j){
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] ans = findPeakGrid(matrix) ;
        System.out.println(Arrays.toString(ans));
    }
}
