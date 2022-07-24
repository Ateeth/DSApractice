import java.util.* ; 
public class Main
{
    public static ArrayList<ArrayList<Integer>> subseq(int[] arr){
        Arrays.sort(arr) ; 
        ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>() ; 
        outer.add(new ArrayList<Integer>()) ;
        int s = 0 , e = 0 ; 
        for(int i = 0 ; i < arr.length ; ++i){
            s = 0 ;
            if(i > 0  && arr[i] == arr[i - 1] ){
                s = e + 1 ; 
            }
            e = outer.size() - 1 ; 
            int n = outer.size() ;
             
            for(int j =  s ; j < n ; ++j){
                ArrayList<Integer> internal = new ArrayList<Integer>(outer.get(j)) ;
                internal.add(arr[i]) ; 
                outer.add(internal) ; 
            }
        }
        
        return outer ; 
    }
	public static void main(String[] args) {
		int[] arr = {1 , 2 , 3 , 4 , 7 , 9 , 1} ; 
		ArrayList<ArrayList<Integer>> ans = subseq(arr) ; 
		for(int i = 0 ; i < ans.size() ; ++i){
		    System.out.println(ans.get(i)) ; 
		}
	}
}
