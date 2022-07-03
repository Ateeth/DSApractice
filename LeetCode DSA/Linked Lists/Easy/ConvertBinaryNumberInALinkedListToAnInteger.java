// Question Link : https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  // way 1
    public static ListNode reverse(ListNode head){
        ListNode prev = null ; 
        ListNode current = head ; 
        ListNode next = current.next ; 
        
        while(current != null){
            current.next = prev ; 
            prev = current ; 
            current = next ; 
            if(next != null){
                next = next.next ; 
            }
        }
        
       
        
        ListNode temp = head ; 
        while(temp != null){
            System.out.print(temp.val + " ") ; 
            temp = temp.next ; 
        }
        return head  ; 
    }
    
    public int getDecimalValue(ListNode head) {
        if(head == null || head.next == null){
            return head.val ; 
        }
        
        head = reverse(head) ; 
        int ans = 0 ; 
        ListNode temp = head ; 
        int base = 1 ; 
        
        while(temp != null){
            
            ans += base * temp.val ; 
            base *= 2 ; 
            temp = temp.next ; 
        }
        
        return ans ; 
    }
  
  //way 2
    public int getDecimalValue(ListNode head) {
       int sum = 0;
       ListNode temp = head ;  
        while (temp != null){
            sum *= 2;
            sum += temp.val;
            temp = temp.next;
        }
        return sum;
    }
 }
