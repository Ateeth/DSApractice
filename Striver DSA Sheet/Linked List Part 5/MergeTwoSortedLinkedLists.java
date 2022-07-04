//Problem Link : https://leetcode.com/problems/merge-two-sorted-lists/
package com.ateeth.StriverSheet.LinkedList5;

public class MergeTwoSortedLinkedLists {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }
    }

    public ListNode mergeTwoLists(ListNode first, ListNode second) {
        ListNode dummyHead = new ListNode() ;
        ListNode tail = dummyHead ;
        while(first != null && second != null){
            if(first.val < second.val){
                tail.next = first ;
                first = first.next ;
                tail = tail.next ;
            }else{
                tail.next = second ;
                second = second.next ;
                tail = tail.next ;
            }
        }

        while(first != null){
            tail.next = first ;
            first = first.next ;
            tail = tail.next ;
        }

        while(second != null){
            tail.next = second ;
            second = second.next ;
            tail = tail.next ;
        }

        return dummyHead.next  ;
    }
}
