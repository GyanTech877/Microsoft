/*
Given a linked list, swap every two adjacent nodes and return its head.
*/

/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param head: a ListNode
     * @return: a ListNode
     */
    public ListNode swapPairs(ListNode head) {
       if(head==null || head.next == null) return head;
       ListNode prev =null;
       ListNode curr=head;
       ListNode newHead=head.next;
       while (curr != null){
           ListNode next = curr.next;
           curr.next = null;
           if(prev!=null)
           prev.next=(next!=null?next:curr);
           if(next==null) break;
           ListNode nextNext= next.next;
           next.next=curr;
           prev=curr;
           curr=nextNext;
       }
       return newHead;
    }
}
