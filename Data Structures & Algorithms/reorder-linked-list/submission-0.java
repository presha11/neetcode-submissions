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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        
        ListNode fast = head;
        ListNode slow = head;

        // ListNode mid = null;

        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

      ListNode  curr = slow.next;
        slow.next = null;

        ListNode prev =  null;
        // ListNode curr = mid;

        while(curr!=null)
        {
            ListNode temp  = curr.next;
            curr.next = prev;
            prev  = curr;
            curr = temp;

        }

        ListNode first = head;
        curr = prev;
        while(curr!=null)
        {
            ListNode tmp1 = first.next;
            ListNode tmp2 = curr.next;
            first.next = curr;
            curr.next = tmp1;
            first = tmp1;
            curr = tmp2;
        }
    }
}
