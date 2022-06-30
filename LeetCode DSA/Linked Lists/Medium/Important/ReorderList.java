//Question Link : https://leetcode.com/problems/reorder-list/

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
    public ListNode getMid(ListNode head){
        ListNode fast = head ; 
        ListNode slow = head ; 
        
        while(fast != null && fast.next != null){
            fast = fast.next.next ; 
            slow = slow.next ; 
        }
        return slow ; 
    }
    
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head ; 
        }
        
        ListNode prev = null ; 
        ListNode present = head ; 
        ListNode next = head.next ;
        
        while(present != null){
            present.next = prev ; 
            prev = present ; 
            present = next ; 
            if(next != null){
                next = next.next ; 
            }
        }
        head = prev ; 
        return head ; 
    }
    
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return ; 
        }
        
        //Reverse second half of linked list
        //then establish link with head of linked list and head of second part of linked list and keep moving them forward
        ListNode mid = getMid(head) ; 
        ListNode headSecond = reverseList(mid) ; 
        ListNode headFirst = head ; 
        ListNode temp ; 
        
        while(headFirst != null && headSecond != null){
            temp = headFirst.next; 
            headFirst.next = headSecond ;
            headFirst = temp ; 
            
            temp = headSecond.next ; 
            headSecond.next = headFirst ; 
            headSecond = temp ; 
        }
        
        //make headFirst as the last node if not null
        if(headFirst != null){
            headFirst.next = null ; 
        }
    }
}
