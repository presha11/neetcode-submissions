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
        Node head1 = head;

        while (head1 != null) {
           Node newNode = new Node(head1.val);
            newNode.next = head1.next;
            head1.next = newNode;
            head1 = newNode.next;


        }

        head1 = head;
        while(head1!=null)
        {
            if(head1.random !=null)
            {
                head1.next.random = head1.random.next;
              
            }

  head1 = head1.next.next;
        }

        Node dummy = new Node(0);
        Node copyCurr = dummy;

        head1 = head;

        while(head1!=null)
        {
            copyCurr.next = head1.next;
            head1.next = head1.next.next;
            head1=head1.next;
            copyCurr = copyCurr.next;
        }

        return dummy.next;
    }
}
