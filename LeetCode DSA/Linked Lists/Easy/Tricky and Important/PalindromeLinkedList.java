//Question Link: https://leetcode.com/problems/palindrome-linked-list/

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
    
    //use fast and slow pointers to find middle node of linked list and return
    public ListNode getMid(ListNode head){
        ListNode fast = head; 
        ListNode slow = head ; 
        while(fast != null && fast.next != null){
            fast = fast.next.next  ; 
            slow = slow.next ; 
        }
        
        return slow ; 
    }
    
    //regular inplace reversal
    public ListNode reverseList(ListNode head){
        ListNode prev = null ; 
        if(head == null || head.next == null){
            return head ; 
        }
        ListNode curr = head ;
        ListNode next = head.next ; 
        
        while(curr != null){
            curr.next = prev ; 
            prev = curr ; 
            curr = next ; 
            
            if(next != null){
                next = next.next ; 
            }
        }
        
        head = prev ; 
        return head ;
    }
    
    public boolean isPalindrome(ListNode head) {
        //Find the Middle Node in the Linked List
        ListNode mid = getMid(head) ; 
        
        //Reverse the second half of the linked list
        ListNode headSecond = reverseList(mid) ; 
        ListNode secondHead = headSecond ; 
        ListNode temp = head ; 
        
        //Traverse the linked list from head and also from middle of the list (reversed part of list)
        
        while(temp != null && secondHead != null){
            //as long as values r equal keep traversing
            if(temp.val != secondHead.val){
                break ; 
            }
            
            temp = temp.next ; 
            secondHead = secondHead.next ; 
        }
        
        //reverse second half of linked list again to restore orignal structure :)
        reverseList(headSecond) ; 
        
        //if temp == null || secondHead == null means we have reached end of linked list hence it is a palindrome else it is not a palindrome
        return temp == null || secondHead == null ; 
    }
}
