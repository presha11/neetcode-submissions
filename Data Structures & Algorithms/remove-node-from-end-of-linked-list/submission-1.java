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
    public ListNode removeNthFromEnd(ListNode head, int n) {

     ListNode fast = head; 
     int count = 0;
     if(head == null || head.next == null)
     return null;
     while(fast!=null)
     {
        count++;
        fast = fast.next;
     }
    // remove first node
        if (count == n) {
            return head.next;
        }
     int index = count - n ;

     ListNode temp = head;

     for(int i =1; i<index ;i++)
     {
        temp = temp.next;
     }
        temp.next = temp.next.next;

        return head;
    }
}
