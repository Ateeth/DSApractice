//Problem Link : https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
package com.ateeth.LeetCodeDSA.sorting.easy.CouldNotThinkOfOptimalSolution;

import java.util.Arrays;
import java.util.Scanner;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {

    /*
    public double average(int[] salary) {
         Arrays.sort(salary) ;
         double sum = 0 ;
         int i ;

         for(i = 1 ; i < salary.length - 1 ; ++i){
             sum += salary[i] ;
         }

             return (sum / (salary.length - 2)) ;
     }
    */
    public static double average(int[] salary) {
        double sum = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, n = salary.length;
        for (int num : salary) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return (sum - min - max) / (n - 2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; ++i ){
            arr[i] = sc.nextInt() ;
        }

        double ans = average(arr) ;
        System.out.println(ans);
    }
}
