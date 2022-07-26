//Problem Link : https://takeuforward.org/data-structure/subset-ii-print-all-the-unique-subsets/
import java.util.* ; 
public class Solution {
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>() ; 
        ArrayList<Integer> tempList = new ArrayList<>() ; 
        Arrays.sort(arr) ; 
        backtrack(arr , ans , tempList , 0) ; 
        return ans ; 
    }
    
    public static void backtrack(int[] arr , ArrayList<ArrayList<Integer>> ans , ArrayList<Integer> tempList , int idx){
        ans.add(new ArrayList<>(tempList)) ; 
        for(int i = idx ; i < arr.length ; ++i){
            if(i > idx && arr[i] == arr[i - 1]){
                continue ; 
            }
            tempList.add(arr[i]) ; 
            backtrack(arr , ans , tempList , i + 1) ; 
            tempList.remove(tempList.size() - 1) ; 
        }
    }
 
}
