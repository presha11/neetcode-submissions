/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;

        while(temp != null)
        {
            Node node = new Node(temp.val);
            node.next = temp.next;
            temp.next = node;
            temp= node.next;
        }

        temp = head;
        while(temp != null)
        {
            if(temp.random != null)
            {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        temp = head;
        Node dummy = new Node(0);
        Node copyCurr = dummy;
        while(temp!=null)
        {
            copyCurr.next = temp.next;
            temp.next = copyCurr.next.next;
            temp = temp.next;
            copyCurr = copyCurr.next;  
        }

        return dummy.next;
    }
}
