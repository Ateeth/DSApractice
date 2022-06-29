//Question Link : https://leetcode.com/problems/sort-list/
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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head ; 
        }
        
        ListNode mid = getMid(head) ; 
        
        //sort2 halves of list till mid and after mid recursively
        ListNode l1 = sortList(head) ; 
        ListNode l2 = sortList(mid) ; 
        
        return merge(l1 , l2) ; 
    }
    
    public ListNode merge(ListNode l1 , ListNode l2){
        ListNode dummyHead = new ListNode() ; 
        ListNode tail = dummyHead ; 
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                tail.next = l1 ; 
                l1 = l1.next ; 
                tail = tail.next ; 
            }else{
                tail.next = l2 ; 
                l2 = l2.next ; 
                tail = tail.next ; 
            }
        }
        
        tail.next = (l1 != null) ? l1 : l2 ; 
        return dummyHead.next ; 
    }
    
     
    
//     public ListNode getMid(ListNode head){
//         ListNode fast = head ; 
//         ListNode slow = head ; 
//         while(fast != null && fast.next != null){
//             fast = fast.next.next ; 
//             slow = slow.next ; 
//         }
        
//         return slow ; 
//     }
    
     ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
