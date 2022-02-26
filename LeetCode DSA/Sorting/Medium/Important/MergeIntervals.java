//Problem Link : https://leetcode.com/problems/merge-intervals/
package com.ateeth.LeetCodeDSA.sorting.medium.VeryImportant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        // Sort the 2d array by ascending starting point
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        List<int[]> result = new ArrayList<>();

        //this is the current interval we are looking at
        int[] currentInterval = intervals[0];

        //add the first interval to the result as definitely it is the starting interval
        result.add(currentInterval);

        //loop through each interval in the array
        for (int[] interval : intervals) {
            //beginning of current interval
            int current_begin = currentInterval[0] ;

            //end of current interval
            int current_end = currentInterval[1] ;

            //beg of the interval looping through
            int next_beg = interval[0] ;

            //end of the interval currently looping through
            int next_end = interval[1] ;

            //there is an overlap as current interval end is greater/equal to next interval beginnning
            if(current_end >= next_beg){
                //change the end position of the current interval to max of current end and overlapping interval end
                currentInterval[1] = Math.max(current_end , next_end);
            }

            //no overlap thus we may add the current interval
            else{
                //add the next non overlapping interval to output array
                //make the current interval equal to next non overlapping interval
                currentInterval = interval ;
                result.add(currentInterval) ;
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter number of intervals : ");
        int n = sc.nextInt();

        int[][] intervals = new int[n][2] ;
        System.out.println("Enter the intervals one by one : ");
        for(int i = 0 ; i < n ; ++i){
            intervals[i][0] = sc.nextInt() ;
            intervals[i][1] = sc.nextInt();
        }

        int[][] ans = merge(intervals) ;
        for(int i = 0 ; i < ans.length ; ++i){
            System.out.println(Arrays.toString(ans[i]));
        }
    }
}
