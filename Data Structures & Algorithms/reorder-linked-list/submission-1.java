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
        
        ListNode fast = head;
        ListNode slow = head;

        ListNode mid = null;

        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        mid = slow.next;
        slow.next = null;

        ListNode prev =  null;
        ListNode curr = mid;

        while(curr!=null)
        {
            ListNode temp  = curr.next;
            curr.next = prev;
            prev  = curr;
            curr = temp;

        }

        ListNode first = head;
        mid = prev;
        while(mid!=null)
        {
            ListNode tmp1 = first.next;
            ListNode tmp2 = mid.next;
            first.next = mid;
            mid.next = tmp1;
            first = tmp1;
            mid = tmp2;
        }
    }
}
