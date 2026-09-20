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
    public ListNode mergeKLists(ListNode[] lists) {
       List<Integer> list = new ArrayList<>();
     int n = 0 ;
       for(int i =0 ; i < lists.length ; i++)
       {
          ListNode node = lists[i];

          while(node!=null)
          {
            list.add(node.val);
            node = node.next;
          }

       }

       int[] primitiveArray = list.stream()
                           .mapToInt(i -> i)
                           .toArray();
    
    Arrays.sort(primitiveArray);

    ListNode head = new ListNode(-1);
    ListNode cur = head;
    for(int i = 0 ; i < primitiveArray.length ; i++)
    {
      ListNode node = new ListNode(primitiveArray[i]);
      head.next = node;
      head = head.next;  
    }
     

     return cur.next;

    }
}
