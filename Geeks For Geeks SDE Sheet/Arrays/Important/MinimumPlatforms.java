//Problem Link : https://www.geeksforgeeks.org/minimum-number-platforms-required-railwaybus-station/
package com.ateeth.GeeksForGeeksDSA.SDESheet.Arrays.Important;

import java.util.* ;
public class MinimumPlatforms {
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    public static int findPlatform(int arr[], int dep[], int n)
    {
        /*
        Initially one platform is definitely used
        for first train
        */
        int no_of_platforms_used = 1 , result = 1 ;
        int arrIndex = 1 , depIndex = 0 ;

        //Sort arrival and departure times
        Arrays.sort(arr) ;
        Arrays.sort(dep) ;

        while(arrIndex < n && depIndex < n){
            /*
                if the next train arrives before the curent train leaves
                increase the number of platforms currently being used
                and move to the next train arrival index
            */
            if(arr[arrIndex] <= dep[depIndex]){
                ++no_of_platforms_used ;
                ++arrIndex ;
            }

             /*
                if the current train departs before the next train arrives
                decrease the number of platforms currently being used
                and move to the next train departure index
            */
            else if(dep[depIndex] < arr[arrIndex]){
                --no_of_platforms_used ;
                ++depIndex ;
            }

            /*
            Make result max of current number of platforms being used and ma number of platforms being used till now
            */
            result = Math.max(result , no_of_platforms_used) ;
        }

        return result ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of trains : ");
        int n = sc.nextInt();

        System.out.println("Enter the arrival times of trains : ");
        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the departure times of trains : ");
        int[] dep = new int[n] ;
        for(int i = 0 ; i < n ; ++i){
            dep[i] = sc.nextInt();
        }

        System.out.println(findPlatform(arr , dep , n));
    }
}
