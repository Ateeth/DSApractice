//Problem Link : https://leetcode.com/problems/count-items-matching-a-rule/
package com.ateeth.LeetCodeDSA.strings.easy;

import java.util.* ;
public class CountItemsMatchingARule {

    public static int countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {
        int ctr = 0 ;
        int rule = 0 ;



        //given the order is type (index 0)  , color(index1) ,  name(index2)
        if(ruleKey.equals("type")){
            rule = 0 ;
        }else if(ruleKey.equals("color")){
            rule = 1 ;
        }else if(ruleKey.equals("name")){
            rule = 2 ;
        }

        //get the rule of the particular index and compare it with the particular value
        for(List innerList : items){
            if(innerList.get(rule).equals(ruleValue)){
                ++ctr ;
            }
        }
        return ctr ;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        int n ;
        System.out.println("Enter the number of items ") ;
        n = sc.nextInt() ;

        ArrayList<ArrayList<String>> items = new ArrayList<>()   ;

        //initialize to make it 2d
        for(int i = 0 ;  i < n ; ++i){
            items.add(new ArrayList<>()) ;
        }

        //add elements
        System.out.println("Enter the details of the various items  : ") ;
        for(int i = 0 ; i < n ; ++i){
            for(int j = 0 ; j < 3 ; ++j){
                items.get(i).add(sc.next()) ;
            }
        }

        String ruleKey ;
        System.out.println("Enter the ruleKey: ");
        ruleKey = sc.next() ;

        String ruleValue ;
        System.out.println("Enter the ruleValue: ");
        ruleValue = sc.next() ;

        int ans = countMatches( items,  ruleKey,  ruleValue) ;

        System.out.println(ans);

    }

}
