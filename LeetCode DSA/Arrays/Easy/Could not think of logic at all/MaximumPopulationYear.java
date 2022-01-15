//Problem link : https://leetcode.com/problems/maximum-population-year/
package com.ateeth.LeetCodeDSA.arrays.easy.CouldNotThinkOfLogicAtAll;

import java.util.Scanner;

public class MaximumPopulationYear {

    public static int maximumPopulation(int[][] logs) {
        int max = 0 ;

        //it is said 2050 is the last yr
        int[] pop = new int[2051] ;

        //traverse through the logs array
        for(var l : logs){
            //increment index of pop where birth year is there i.e 1st index of the log variable
            ++pop[l[0]] ;

            //decrement index of pop where end year is there i.e 2nd index of the log variable
            --pop[l[1]] ;
        }

        //add the previous year alive people to the consequent years
        for(int i = 1 ; i < pop.length - 1 ; ++i){
            pop[i] += pop[i-1] ;

            //Take the max population per year
            if(pop[max] < pop[i]){
                max = i ; //store the year in max
            }
        }
        return max ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in)  ;
        System.out.println("Enter the number of logs : ") ;
        int n = sc.nextInt() ;

        int[][] logs = new int[n][2] ;
        System.out.println("Enter the logs one by one : ");
        for(int i = 0 ; i < n ; ++i){
            logs[i][0] = sc.nextInt() ;
            logs[i][1] = sc.nextInt();
        }

        int ans = maximumPopulation(logs)  ;
        System.out.println(ans);
    }
}
