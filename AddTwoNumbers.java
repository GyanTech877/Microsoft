/*
You have two numbers represented by a linked list, where each node contains a single digit. 
The digits are stored in reverse order, such that the 1's digit is at the head of the list.
Write a function that adds the two numbers and returns the sum as a linked list.
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
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2 
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
       if(l1==null) return l2;
       if(l2==null) return l1;
       ListNode res=new ListNode(-1);
       ListNode finalRes=res;
       int carry = 0;
       int sum = 0;
       int actualSum=0;
       while(l1!=null && l2!=null){
           actualSum = carry+l1.val+l2.val;
           sum = actualSum%10;
           carry = actualSum/10;
           res.next=new ListNode(sum);
           res=res.next;
           l1=l1.next;
           l2=l2.next;
       }
       while(l1!=null){
           actualSum = carry+l1.val;
           sum = actualSum%10;
           carry = actualSum/10;
           res.next=new ListNode(sum);
           res=res.next;
           l1=l1.next;
       }
       while(l2!=null){
           actualSum = carry+l2.val;
           sum = actualSum%10;
           carry = actualSum/10;
           res.next=new ListNode(sum);
           res=res.next;
           l2=l2.next;
       }
       if(carry!=0){
           res.next=new ListNode(carry);
           res=res.next;
       }
       return finalRes.next;
    }
}
